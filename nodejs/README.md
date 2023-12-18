# NodeJS

## Install

### Linux

```shell
mkdir /opt/nodejs
cd /opt/nodejs
wget https://nodejs.org/dist/v20.10.0/node-v20.10.0-linux-x64.tar.xz
tar -xf node-v20.10.0-linux-x64.tar.xz
```

Create a link for `node` executable file

```shell
alternatives --install /usr/bin/node node /opt/nodejs/node-v20.10.0-linux-x64/bin/node 1
```

```shell
update-alternatives --install /usr/bin/node node /opt/nodejs/node-v20.10.0-linux-x64/bin/node 1
```

## First app

```
const https = require('node:https')
const fs = require('node:fs')

const options = {
    key: fs.readFileSync(''),
    cert: fs.readFileSync('')
}

https.createServer(options, (req, res) => {
    res.writeHead(200)
})
```

## Reference

- https://datatracker.ietf.org/doc/html/rfc8555

