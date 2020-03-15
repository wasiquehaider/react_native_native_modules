import React, {Component} from 'react';
import {Button, View, StyleSheet} from 'react-native';
import {NativeModules, requireNativeComponent} from 'react-native';
const Switch = requireNativeComponent('Switch');
const {ToastModule} = NativeModules;
export default class App extends Component {
  _showToast() {
    ToastModule.showToast('This is a native toast!!');
  }
  render() {
    return (
      <>
        {/* ***Native Toast*** */}
        <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
          <Button onPress={this._showToast} title="Toast Btn" />
        </View>
        {/* ***native switch*** */}
        <View style={styles.container}>
          <Switch
            style={styles.javaBtn}
            isTurnedOn={true}
            textProp={'Native Bridge'}
          />
        </View>
      </>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'pink',
    alignItems: 'center',
    justifyContent: 'center',
  },
  javaBtn: {
    height: 100,
    width: 300,
    backgroundColor: 'yellow',
  },
});
