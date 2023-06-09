# my-azure-github-spring-boot-sample

[![Build and deploy JAR app to Azure Web App](https://github.com/shaunthomas999/my-azure-github-spring-boot-sample/actions/workflows/main_shaun-app-service.yml/badge.svg?branch=main)](https://github.com/shaunthomas999/my-azure-github-spring-boot-sample/actions/workflows/main_shaun-app-service.yml)

# Setup

* Install Java
* Install Git

## Run

* Start the application in Intellij IDEA
* Access endpoint - http://localhost:8080/greetings?name=Shaun

## Deploy

* Option-1 - Github Actions [.github/workflows/main_shaun-app-service.yml](.github%2Fworkflows%2Fmain_shaun-app-service.yml)
* Options-2 - Azure CLI [docs/az-cli-readme.md](docs%2Faz-cli-readme.md)

After deploying in Azure App Service - https://shaun-azure-github-springboot-webapp.azurewebsites.net/greetings?name=Shaun

## References

* Github Actions
  * https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-java-with-gradle
  * https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry
  * https://learn.microsoft.com/en-us/azure/app-service/deploy-continuous-deployment?tabs=github
  * https://learn.microsoft.com/en-us/azure/app-service/app-service-sql-asp-github-actions
  * https://learn.microsoft.com/en-us/azure/app-service/deploy-github-actions?tabs=applevel
