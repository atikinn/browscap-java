package com.blueconic.browscap.impl;

import com.blueconic.browscap.Capabilities;

class CapabilitiesImpl implements Capabilities {
    public final static Capabilities DEFAULT =
            new CapabilitiesImpl(
                    UNKNOWN_BROWSCAP_VALUE,
                    UNKNOWN_BROWSCAP_VALUE,
                    UNKNOWN_BROWSCAP_VALUE,
                    UNKNOWN_BROWSCAP_VALUE,
                    UNKNOWN_BROWSCAP_VALUE,
                    UNKNOWN_BROWSCAP_VALUE,
                    UNKNOWN_BROWSCAP_VALUE,
                    UNKNOWN_BROWSCAP_VALUE,
                    UNKNOWN_BROWSCAP_VALUE,
                    UNKNOWN_BROWSCAP_VALUE,
                    UNKNOWN_BROWSCAP_VALUE,
                    UNKNOWN_BROWSCAP_VALUE,
                    UNKNOWN_BROWSCAP_VALUE);

    private final String myBrowser;
    private final String myBrowserType;
    private final String myBrowserMajorVersion;
    private final String myDeviceType;
    private final String myPlatform;
    private final String myPlatformVersion;
    private final String myPattern;
    private final String myComment;
    private final String myDeviceName;
    private final String myDeviceCodeName;
    private final String myPlatformMaker;
    private final String myDeviceMaker;
    private final String myDeviceBrandName;

    public CapabilitiesImpl(final String pattern,
                            final String browser,
                            final String browserType,
                            final String browserMajorVersion,
                            final String deviceType,
                            final String platform,
                            final String platformVersion,
                            final String comment,
                            final String deviceName,
                            final String deviceCodeName,
                            final String platformMaker,
                            final String deviceMaker,
                            final String deviceBrandName) {
        myPattern = pattern;
        myBrowser = browser;
        myBrowserType = browserType;
        myBrowserMajorVersion = browserMajorVersion;
        myDeviceType = deviceType;
        myPlatform = platform;
        myPlatformVersion = platformVersion;
        myComment = comment;
        myDeviceName = deviceName;
        myDeviceCodeName = deviceCodeName;
        myPlatformMaker = platformMaker;
        myDeviceMaker = deviceMaker;
        myDeviceBrandName = deviceBrandName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPattern() {
        return myPattern;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getBrowser() {
        return myBrowser;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getBrowserType() {
        return myBrowserType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getBrowserMajorVersion() {
        return myBrowserMajorVersion;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPlatform() {
        return myPlatform;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPlatformVersion() {
        return myPlatformVersion;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDeviceType() {
        return myDeviceType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getComment() { return myComment; }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDeviceName() { return myDeviceName; }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDeviceCodeName() { return myDeviceCodeName; }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPlatformMaker() { return myPlatformMaker; }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDeviceMaker() { return myDeviceMaker; }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDeviceBrandName() { return myDeviceBrandName; }

    @Override
    public String toString() {
        return "Capabilities{browser='" + myBrowser
                + "', browserType='" + myBrowserType
                + "', browserMajorVersion='" + myBrowserMajorVersion
                + "', deviceType='" + myDeviceType
                + "', platform='" + myPlatform
                + "', platformVersion='" + myPlatformVersion
                + "', deviceName='" + myDeviceName
                + "', deviceCodeName='" + myDeviceCodeName
                + "', comment='" + myComment
                + "', pattern='" + myPattern
                +'}';
    }
}
