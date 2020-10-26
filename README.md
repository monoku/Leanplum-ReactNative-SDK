# react-native-leanplum
If you have already installed Node on your system, make sure it is Node 8.3 or newer.

##### Important note:
This is forked repo the original code is on https://github.com/Leanplum/Leanplum-ReactNative-SDK
 
## Getting started using npm registry

### Inside the React Native App
1. `$ yarn add @monoku/react-native-leanplum` or `$ npm install @monoku/react-native-leanplum`

2. `$ npx react-native link @monoku/react-native-leanplum`

3. For iOS only `$ cd ios && pod install`

4. Please refer to https://docs.leanplum.com/reference#leanplum-sdk-setup for iOS or Android configuration and more usages

## Push notifications

Please refer to: https://github.com/react-native-community/react-native-push-notification-ios

## Usage
```javascript
import {Leanplum, LeanplumInbox} from '@monoku/react-native-leanplum';

// TODO: What to do with the module?
Leanplum.setAppIdForDevelopmentMode('APP_ID', 'DEVELOPMENT_KEY');
Leanplum.start();
const inbox = await LeanplumInbox.inbox();
```

## Local development
1. Install yarn global `$ npm install -g yarn`

2. Install dependencies for generating builds `$ yarn install`

3. Build the sdk and publish it for local development purposes `$ yarn local-publish`