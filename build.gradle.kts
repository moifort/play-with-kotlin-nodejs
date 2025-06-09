plugins {
    kotlin("multiplatform") version "2.0.21"
}

repositories {
    mavenCentral()
}

kotlin {
    js(IR) {
        nodejs {
            binaries.executable()
        }
    }
    sourceSets {
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
