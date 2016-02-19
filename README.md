# rs-demo

app that can be used as a simple "route services" target. Responds with header information, logs requests, and can be tailed, etc.

see [here](http://docs.cloudfoundry.org/services/route-services.html) for info on registering this as a UPS.

for slot8 (dev/dev):

$ cf push
$ cf space dev --guid 
  --> 267abc9e-d4f3-4552-80ca-70fa3daaa614
  
$ cf curl /v2/user_provided_service_instances -X POST -d '{"space_guid":
"267abc9e-d4f3-4552-80ca-70fa3daaa614","name":"my-upsi","route_service_url”:”https://rs-demo.pcfaas-slot8.pez.pivotal.io"}'
