plugins {
    kotlin("multiplatform")
}

repositories {
    mavenCentral()
}

kotlin {
    js {
        browser {
        }
        binaries.executable()
    }


    sourceSets {
        commonTest {
            dependencies {
                implementation(libs.kotlin.test)
                implementation(project(":ui-test"))
            }
        }
    }
}
