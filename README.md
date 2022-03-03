# Simple Company API

## Summary 

This API is an example of a REST service with a simple company data set

## Example curl commands

### Get all data example

``` bash
 curl http://localhost:8080/companies
 # example output
[{"id":1,"companyNumber":"SC1006","companyName":"MyHaggis LTY"},{"id":2,"companyNumber":"SC1010","companyName":"Hairdressers"}]vmorgan1@PD16611 simple-companies-api 
```

### Create new company example

```bash
curl -H "Content-Type: application/json" \
 -X POST \
 -d '{"company_name": "YELLOW SUBMARINE", "company_number": "SC0011"}'  \
 -w '%{http_code}' http://localhost:8080/create-company
```

### Update company example

```bash
curl -H "Content-Type: application/json" \
 -X PUT \
 -d '{"company_name": "YELLOW BOAT", "company_number": "SC0011"}'  \
 -w '%{http_code}' http://localhost:8080/companies/1
 
```