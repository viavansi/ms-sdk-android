# Mobile Services SDK Android

### Installation guide as an Android Studio Module

1. Download the module `ms-sdk-android` from the provided url and copy the path to your local folder.
2. Add the following code to the `settings.gradle` of your project to search for that module on the local path.

		include ':ms-sdk-android'
		project(':ms-sdk-android').projectDir = new File(settingsDir, '<path_to>/ms-sdk-android')

3. Add the following code to the `build.gradle` of your project in order to reference the library.

		dependencies {
			compile project(':ms-sdk-android')
			...
		}

### Deployment and installation guides using Maven Local Repository

1. You need `ms-sdk-android-release.aar`:
  * Download it from the provided link, or
  * Run `gradle build` from the root of the project library if you have the source, the `ms-sdk-android-release.aar` will be generated in `build/outputs/` folder.
2. If necessary, install the latest JDK and set the JAVA_HOME environment.
3. If necessary, install Maven. You can download it here: http://maven.apache.org/download.cgi. Set the MAVEN_HOME environment variable to the path where you extracted maven, and add the maven's bin folder to the PATH environment variable.
4. To test that Maven is working fine, open a new console window and run the following:

		> mvn -version
5. Add the aar. library to your local maven repository. Run:

		mvn install:install-file -Dfile=<path_to_aar_file> -DgroupId=com.viafirma -DartifactId=ms-sdk-android -Dversion=1.0 -Dpackaging=aar

6. Add the following code to the `build.gradle` of the app which will use _Viafirma Android Lib_:

		repositories {
			mavenLocal()
			...
		}
		...
		dependencies {
			compile 'com.viafirma:ms-sdk-android:1.0'
			...
		}

### Installation guides using Maven Remote Repository

1. Just modify the `build.gradle` of your project to include the following code.

		repositories {
			maven { url "http://repositorio.viavansi.com/artifactory/libs-releases-local/" }
			...
		}
		...
		dependencies {
			compile 'com.viafirma:ms-sdk-android:3.6.+'
			...
		}

### Deployment guide for Maven Remote Repository

1. If necessary, install Gradle distribution 2.2.1 or upper. You can download it here: http://www.gradle.org/downloads. Set the GRADLE_HOME environment variable to the path where you extracted Gradle, and add the Gradle folder to the PATH environment variable.
2. To test that Gradle is working fine, open a new console window and run the following:

		> gradle -v
3. From the command line, in the path where you have the source, run the following command:

```
gradle releaseVersion
```

or 

```
gradle snapshotVersion
```

4. This will generate all the files and upload the AAR to the repository specified on `gradle.properties`
5. You need to specify a new version number every time, the account configured does not have permission to modify/remove uploaded artifacts.
