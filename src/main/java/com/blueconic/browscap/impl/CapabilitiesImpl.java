package com.blueconic.browscap.impl;

import com.blueconic.browscap.Capabilities;

class CapabilitiesImpl implements Capabilities {
    public final static Capabilities DEFAULT =
            new CapabilitiesImpl(
                    UNKNOWN_BROWSCAP_VALUE,
                    "Default Browser",
                    "Default Browser",
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

    public CapabilitiesImpl(final String pattern,
                            final String browser,
                            final String browserType,
                            final String browserMajorVersion,
                            final String deviceType,
                            final String platform,
                            final String platformVersion,
                            final String comment) {

        myPattern = pattern;
        myBrowser = browser;
        myBrowserType = browserType;
        myBrowserMajorVersion = browserMajorVersion;
        myDeviceType = deviceType;
        myPlatform = platform;
        myPlatformVersion = platformVersion;
        myComment = comment;
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

    @Override
    public String toString() {
        return "Capabilities{browser='" + myBrowser + "', browserType='" + myBrowserType + "', browserMajorVersion='"
                + myBrowserMajorVersion + "', deviceType='" + myDeviceType + "', platform='" + myPlatform
                + "', platformVersion='" + myPlatformVersion + '}';
    }
}
