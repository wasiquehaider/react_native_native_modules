package com.reactnativebridgedemo;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class SwitchManager extends SimpleViewManager<Switch> {
    @Override
    public String getName() {
        return "Switch";
    }
    @Override
    protected Switch createViewInstance(ThemedReactContext reactContext) {
        return new Switch(reactContext);
    }
    @ReactProp(name="isTurnedOn")
    public void setSwitchStatus(Switch switchView, Boolean isTurnedOn) {
        switchView.setIsTurnedOn(isTurnedOn);
    }
    @ReactProp(name="textProp")
    public void setTextStatus(Switch switchView, String textProp) {
        switchView.setTextProp(textProp);
    }
}
