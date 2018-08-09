# Status

[![Build Status](https://travis-ci.org/joshchamberlain/CS471-Assignments-UMLIntro-GitHubTest2.svg?branch=master)](https://travis-ci.org/joshchamberlain/CS471-Assignments-UMLIntro-GitHubTest2)

![Sonar Status](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=alert_status)

![Bugs](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=bugs)

![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=code_smells)

![Test Coverage](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=coverage)

![Duplicate Lines](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=duplicated_lines_density)

![LOC](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=ncloc)

![Security](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=sqale_rating)

![Reliability](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=reliability_rating)

![Security](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=security_rating)

![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=sqale_index)

![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=edu.boisestate.cs471%3Asorting&metric=vulnerabilities)

[![Maintainability](https://api.codeclimate.com/v1/badges/83d3e1b3bb55ec1867db/maintainability)](https://codeclimate.com/github/joshchamberlain/CS471-Assignments-UMLIntro-GitHubTest2/maintainability)

[![Test Coverage](https://api.codeclimate.com/v1/badges/83d3e1b3bb55ec1867db/test_coverage)](https://codeclimate.com/github/joshchamberlain/CS471-Assignments-UMLIntro-GitHubTest2/test_coverage)

# Overview
The source code is hosted on GitHub, built by Travis CI, and analyzed by Code Climate and Sonar Cloud

## Travis
The travis configuration is contained almost entirely in the `<project>/.travis.yml` file. There are two secret
values. One is an API token to GitHub, and the other is a token for Sonar Cloud. 
 * Requires GUI: No
 * Requires CLI Tool: Yes, for initial setup
 * Requires Config File: Yes, `.travis.yml`

Gotchas:
 * travis-ci.org versus travis-ci.com. Make sure you are only using .org. Otherwise, any encrypted environmental
 variables will fail.
 * Safest approach is to configure travis from the command line instead of using the GUI/browser
 
## Code Climate
This service analyzes the build.
 * Requires GUI: Yes
 * Requires CLI Tool: No
 * Requires Config File: Optional, we have one to enable extra plugins, `.codeclimate.yml`
 
Gotchas:
 * It does not automatically find unit test coverage reports. The `.travis.yml` configuration must be updated to upload
 the report to Code Climate.

## Sonar Cloud
Like Code Climate, this also analyzes the build.
 * Requires GUI: Yes
 * Requires CLI Tool: No
 * Requires Config File: No
 
Gotcahs:
 * Authentication can be tricky. 
   1. The token should be encrypted using the Travis command line tool as follows:
    ```
    travis encrypt SONAR_TOKEN=<token>
    ```
   2. Add the token to the global environmental variables in the `.travis.yml` file
   3. Use the token by adding `-Dsonar.login=${SONAR_TOKEN}` when having Travis run the sonar:sonar maven goal. 
 
 
 
 
 
 
 
 
 
 