plugins {
    id("org.springframework.boot") version "3.3.0"
    id("io.spring.dependency-management") version "1.1.5"
    kotlin("jvm") version "1.9.24"
    kotlin("plugin.spring") version "1.9.24"
    kotlin("plugin.serialization") version "1.7.0"
}

group = "com.ax"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
//   序列化 JSON
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.0")
//    二进制序列化 Protocol buffers
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:1.7.0")
    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
//    数据库
    runtimeOnly("com.mysql:mysql-connector-j")
//    mybatis-flex
    implementation("com.mybatis-flex:mybatis-flex-spring-boot3-starter:1.9.2")
    //kotlin扩展库
    implementation("com.mybatis-flex:mybatis-flex-kotlin-extensions:1.0.9")
    //核心库
    implementation("com.mybatis-flex:mybatis-flex-core:1.9.3")

    implementation("com.zaxxer:HikariCP:5.0.0")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    // JWT
    implementation("com.auth0:java-jwt:4.4.0")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
