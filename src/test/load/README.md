# load testing

We're using K6 to load test the application. If K6 is added to your path, run:

```shell
$ k6 run default.js
```


## Dashboard

K6 provides native support for a web dashboard to review the load and traffic,
use the following flag to enable the built-in dashboard:

```shell
$ K6_WEB_DASHBOARD=true ./k6 run script.js
```

The URL should be listed on the terminal for you to preview the results.

> It is advised to disable the HTTP-based dashboard in the CI environments.

For Windows environments, you must set the environment variables differently.

```powersehll
> $env:K6_WEB_DASHBOARD = "true"
```

You can clear the variable:

```powershell
> Remove-Item env:K6_WEB_DASHBOARD
```
