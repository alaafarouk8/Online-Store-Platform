docker build -t hello-world C:\Users\alaaf\Downloads\GitHubForProject\SoftwareEngineering2Project\UserApplication
docker tag hello-world 20170058/onlinestore:latest
docker push 20170058/online:latest
docker image rm -f hello-world:latest
docker image rm -f 20170058/online:latest