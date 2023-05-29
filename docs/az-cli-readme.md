# AZ CLI

* `az login`
* `az account list`
* `az account list-locations` - westeurope
* `az account tenant list` - *Experimental
* `az webapp list-runtimes` - list runtimes for Linux and Windows
  * Linux - Java 17 - `JAVA:17-java17`

## Create

```
az group create --location westeurope --name shaun-azure-github-springboot-rg
```

```
az appservice plan create \
    --resource-group shaun-azure-github-springboot-rg \
    --name shaun-azure-github-springboot-asp \
    --is-linux \
    --sku S1
```

```
az webapp create \
    --resource-group shaun-azure-github-springboot-rg \
    --plan shaun-azure-github-springboot-asp \
    --name shaun-azure-github-springboot-webapp \
    --runtime "JAVA:17-java17"
```

## Deploy

```
az webapp deploy \
    --resource-group shaun-azure-github-springboot-rg \
     --name shaun-azure-github-springboot-webapp \
     --src-path ./build/libs/*.jar \
     --type jar \
     --clean true \
     --async true
```

## Delete

```
az group delete --name shaun-azure-github-springboot-rg
```

```
az appservice plan delete --resource-group shaun-azure-github-springboot-rg --name shaun-azure-github-springboot-asp
```

```
az webapp delete --resource-group shaun-azure-github-springboot-rg --name shaun-azure-github-springboot-webapp
```

## Reference

* Disable MFA prompt - https://www.c-sharpcorner.com/article/solution-due-to-a-configuration-change-made-by-your-administrator-while-connect/
* az webapp CLI - https://learn.microsoft.com/en-us/cli/azure/webapp?view=azure-cli-latest
* Package deployment - https://learn.microsoft.com/en-us/azure/app-service/deploy-zip?tabs=cli
*
