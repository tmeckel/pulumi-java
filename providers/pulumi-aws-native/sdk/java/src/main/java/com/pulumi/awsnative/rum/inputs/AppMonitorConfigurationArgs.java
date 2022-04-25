// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.rum.inputs;

import com.pulumi.awsnative.rum.enums.AppMonitorTelemetry;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AppMonitor configuration
 * 
 */
public final class AppMonitorConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppMonitorConfigurationArgs Empty = new AppMonitorConfigurationArgs();

    /**
     * If you set this to true, the RUM web client sets two cookies, a session cookie and a user cookie. The cookies allow the RUM web client to collect data relating to the number of users an application has and the behavior of the application across a sequence of events. Cookies are stored in the top-level domain of the current page.
     * 
     */
    @Import(name="allowCookies")
    private @Nullable Output<Boolean> allowCookies;

    /**
     * @return If you set this to true, the RUM web client sets two cookies, a session cookie and a user cookie. The cookies allow the RUM web client to collect data relating to the number of users an application has and the behavior of the application across a sequence of events. Cookies are stored in the top-level domain of the current page.
     * 
     */
    public Optional<Output<Boolean>> allowCookies() {
        return Optional.ofNullable(this.allowCookies);
    }

    /**
     * If you set this to true, RUM enables xray tracing for the user sessions that RUM samples. RUM adds an xray trace header to allowed HTTP requests. It also records an xray segment for allowed HTTP requests. You can see traces and segments from these user sessions in the xray console and the CW ServiceLens console.
     * 
     */
    @Import(name="enableXRay")
    private @Nullable Output<Boolean> enableXRay;

    /**
     * @return If you set this to true, RUM enables xray tracing for the user sessions that RUM samples. RUM adds an xray trace header to allowed HTTP requests. It also records an xray segment for allowed HTTP requests. You can see traces and segments from these user sessions in the xray console and the CW ServiceLens console.
     * 
     */
    public Optional<Output<Boolean>> enableXRay() {
        return Optional.ofNullable(this.enableXRay);
    }

    /**
     * A list of URLs in your website or application to exclude from RUM data collection. You can&#39;t include both ExcludedPages and IncludedPages in the same operation.
     * 
     */
    @Import(name="excludedPages")
    private @Nullable Output<List<String>> excludedPages;

    /**
     * @return A list of URLs in your website or application to exclude from RUM data collection. You can&#39;t include both ExcludedPages and IncludedPages in the same operation.
     * 
     */
    public Optional<Output<List<String>>> excludedPages() {
        return Optional.ofNullable(this.excludedPages);
    }

    /**
     * A list of pages in the RUM console that are to be displayed with a favorite icon.
     * 
     */
    @Import(name="favoritePages")
    private @Nullable Output<List<String>> favoritePages;

    /**
     * @return A list of pages in the RUM console that are to be displayed with a favorite icon.
     * 
     */
    public Optional<Output<List<String>>> favoritePages() {
        return Optional.ofNullable(this.favoritePages);
    }

    /**
     * The ARN of the guest IAM role that is attached to the identity pool that is used to authorize the sending of data to RUM.
     * 
     */
    @Import(name="guestRoleArn")
    private @Nullable Output<String> guestRoleArn;

    /**
     * @return The ARN of the guest IAM role that is attached to the identity pool that is used to authorize the sending of data to RUM.
     * 
     */
    public Optional<Output<String>> guestRoleArn() {
        return Optional.ofNullable(this.guestRoleArn);
    }

    /**
     * The ID of the identity pool that is used to authorize the sending of data to RUM.
     * 
     */
    @Import(name="identityPoolId")
    private @Nullable Output<String> identityPoolId;

    /**
     * @return The ID of the identity pool that is used to authorize the sending of data to RUM.
     * 
     */
    public Optional<Output<String>> identityPoolId() {
        return Optional.ofNullable(this.identityPoolId);
    }

    /**
     * If this app monitor is to collect data from only certain pages in your application, this structure lists those pages. You can&#39;t include both ExcludedPages and IncludedPages in the same operation.
     * 
     */
    @Import(name="includedPages")
    private @Nullable Output<List<String>> includedPages;

    /**
     * @return If this app monitor is to collect data from only certain pages in your application, this structure lists those pages. You can&#39;t include both ExcludedPages and IncludedPages in the same operation.
     * 
     */
    public Optional<Output<List<String>>> includedPages() {
        return Optional.ofNullable(this.includedPages);
    }

    /**
     * Specifies the percentage of user sessions to use for RUM data collection. Choosing a higher percentage gives you more data but also incurs more costs. The number you specify is the percentage of user sessions that will be used. If you omit this parameter, the default of 10 is used.
     * 
     */
    @Import(name="sessionSampleRate")
    private @Nullable Output<Double> sessionSampleRate;

    /**
     * @return Specifies the percentage of user sessions to use for RUM data collection. Choosing a higher percentage gives you more data but also incurs more costs. The number you specify is the percentage of user sessions that will be used. If you omit this parameter, the default of 10 is used.
     * 
     */
    public Optional<Output<Double>> sessionSampleRate() {
        return Optional.ofNullable(this.sessionSampleRate);
    }

    /**
     * An array that lists the types of telemetry data that this app monitor is to collect.
     * 
     */
    @Import(name="telemetries")
    private @Nullable Output<List<AppMonitorTelemetry>> telemetries;

    /**
     * @return An array that lists the types of telemetry data that this app monitor is to collect.
     * 
     */
    public Optional<Output<List<AppMonitorTelemetry>>> telemetries() {
        return Optional.ofNullable(this.telemetries);
    }

    private AppMonitorConfigurationArgs() {}

    private AppMonitorConfigurationArgs(AppMonitorConfigurationArgs $) {
        this.allowCookies = $.allowCookies;
        this.enableXRay = $.enableXRay;
        this.excludedPages = $.excludedPages;
        this.favoritePages = $.favoritePages;
        this.guestRoleArn = $.guestRoleArn;
        this.identityPoolId = $.identityPoolId;
        this.includedPages = $.includedPages;
        this.sessionSampleRate = $.sessionSampleRate;
        this.telemetries = $.telemetries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppMonitorConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppMonitorConfigurationArgs $;

        public Builder() {
            $ = new AppMonitorConfigurationArgs();
        }

        public Builder(AppMonitorConfigurationArgs defaults) {
            $ = new AppMonitorConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowCookies If you set this to true, the RUM web client sets two cookies, a session cookie and a user cookie. The cookies allow the RUM web client to collect data relating to the number of users an application has and the behavior of the application across a sequence of events. Cookies are stored in the top-level domain of the current page.
         * 
         * @return builder
         * 
         */
        public Builder allowCookies(@Nullable Output<Boolean> allowCookies) {
            $.allowCookies = allowCookies;
            return this;
        }

        /**
         * @param allowCookies If you set this to true, the RUM web client sets two cookies, a session cookie and a user cookie. The cookies allow the RUM web client to collect data relating to the number of users an application has and the behavior of the application across a sequence of events. Cookies are stored in the top-level domain of the current page.
         * 
         * @return builder
         * 
         */
        public Builder allowCookies(Boolean allowCookies) {
            return allowCookies(Output.of(allowCookies));
        }

        /**
         * @param enableXRay If you set this to true, RUM enables xray tracing for the user sessions that RUM samples. RUM adds an xray trace header to allowed HTTP requests. It also records an xray segment for allowed HTTP requests. You can see traces and segments from these user sessions in the xray console and the CW ServiceLens console.
         * 
         * @return builder
         * 
         */
        public Builder enableXRay(@Nullable Output<Boolean> enableXRay) {
            $.enableXRay = enableXRay;
            return this;
        }

        /**
         * @param enableXRay If you set this to true, RUM enables xray tracing for the user sessions that RUM samples. RUM adds an xray trace header to allowed HTTP requests. It also records an xray segment for allowed HTTP requests. You can see traces and segments from these user sessions in the xray console and the CW ServiceLens console.
         * 
         * @return builder
         * 
         */
        public Builder enableXRay(Boolean enableXRay) {
            return enableXRay(Output.of(enableXRay));
        }

        /**
         * @param excludedPages A list of URLs in your website or application to exclude from RUM data collection. You can&#39;t include both ExcludedPages and IncludedPages in the same operation.
         * 
         * @return builder
         * 
         */
        public Builder excludedPages(@Nullable Output<List<String>> excludedPages) {
            $.excludedPages = excludedPages;
            return this;
        }

        /**
         * @param excludedPages A list of URLs in your website or application to exclude from RUM data collection. You can&#39;t include both ExcludedPages and IncludedPages in the same operation.
         * 
         * @return builder
         * 
         */
        public Builder excludedPages(List<String> excludedPages) {
            return excludedPages(Output.of(excludedPages));
        }

        /**
         * @param excludedPages A list of URLs in your website or application to exclude from RUM data collection. You can&#39;t include both ExcludedPages and IncludedPages in the same operation.
         * 
         * @return builder
         * 
         */
        public Builder excludedPages(String... excludedPages) {
            return excludedPages(List.of(excludedPages));
        }

        /**
         * @param favoritePages A list of pages in the RUM console that are to be displayed with a favorite icon.
         * 
         * @return builder
         * 
         */
        public Builder favoritePages(@Nullable Output<List<String>> favoritePages) {
            $.favoritePages = favoritePages;
            return this;
        }

        /**
         * @param favoritePages A list of pages in the RUM console that are to be displayed with a favorite icon.
         * 
         * @return builder
         * 
         */
        public Builder favoritePages(List<String> favoritePages) {
            return favoritePages(Output.of(favoritePages));
        }

        /**
         * @param favoritePages A list of pages in the RUM console that are to be displayed with a favorite icon.
         * 
         * @return builder
         * 
         */
        public Builder favoritePages(String... favoritePages) {
            return favoritePages(List.of(favoritePages));
        }

        /**
         * @param guestRoleArn The ARN of the guest IAM role that is attached to the identity pool that is used to authorize the sending of data to RUM.
         * 
         * @return builder
         * 
         */
        public Builder guestRoleArn(@Nullable Output<String> guestRoleArn) {
            $.guestRoleArn = guestRoleArn;
            return this;
        }

        /**
         * @param guestRoleArn The ARN of the guest IAM role that is attached to the identity pool that is used to authorize the sending of data to RUM.
         * 
         * @return builder
         * 
         */
        public Builder guestRoleArn(String guestRoleArn) {
            return guestRoleArn(Output.of(guestRoleArn));
        }

        /**
         * @param identityPoolId The ID of the identity pool that is used to authorize the sending of data to RUM.
         * 
         * @return builder
         * 
         */
        public Builder identityPoolId(@Nullable Output<String> identityPoolId) {
            $.identityPoolId = identityPoolId;
            return this;
        }

        /**
         * @param identityPoolId The ID of the identity pool that is used to authorize the sending of data to RUM.
         * 
         * @return builder
         * 
         */
        public Builder identityPoolId(String identityPoolId) {
            return identityPoolId(Output.of(identityPoolId));
        }

        /**
         * @param includedPages If this app monitor is to collect data from only certain pages in your application, this structure lists those pages. You can&#39;t include both ExcludedPages and IncludedPages in the same operation.
         * 
         * @return builder
         * 
         */
        public Builder includedPages(@Nullable Output<List<String>> includedPages) {
            $.includedPages = includedPages;
            return this;
        }

        /**
         * @param includedPages If this app monitor is to collect data from only certain pages in your application, this structure lists those pages. You can&#39;t include both ExcludedPages and IncludedPages in the same operation.
         * 
         * @return builder
         * 
         */
        public Builder includedPages(List<String> includedPages) {
            return includedPages(Output.of(includedPages));
        }

        /**
         * @param includedPages If this app monitor is to collect data from only certain pages in your application, this structure lists those pages. You can&#39;t include both ExcludedPages and IncludedPages in the same operation.
         * 
         * @return builder
         * 
         */
        public Builder includedPages(String... includedPages) {
            return includedPages(List.of(includedPages));
        }

        /**
         * @param sessionSampleRate Specifies the percentage of user sessions to use for RUM data collection. Choosing a higher percentage gives you more data but also incurs more costs. The number you specify is the percentage of user sessions that will be used. If you omit this parameter, the default of 10 is used.
         * 
         * @return builder
         * 
         */
        public Builder sessionSampleRate(@Nullable Output<Double> sessionSampleRate) {
            $.sessionSampleRate = sessionSampleRate;
            return this;
        }

        /**
         * @param sessionSampleRate Specifies the percentage of user sessions to use for RUM data collection. Choosing a higher percentage gives you more data but also incurs more costs. The number you specify is the percentage of user sessions that will be used. If you omit this parameter, the default of 10 is used.
         * 
         * @return builder
         * 
         */
        public Builder sessionSampleRate(Double sessionSampleRate) {
            return sessionSampleRate(Output.of(sessionSampleRate));
        }

        /**
         * @param telemetries An array that lists the types of telemetry data that this app monitor is to collect.
         * 
         * @return builder
         * 
         */
        public Builder telemetries(@Nullable Output<List<AppMonitorTelemetry>> telemetries) {
            $.telemetries = telemetries;
            return this;
        }

        /**
         * @param telemetries An array that lists the types of telemetry data that this app monitor is to collect.
         * 
         * @return builder
         * 
         */
        public Builder telemetries(List<AppMonitorTelemetry> telemetries) {
            return telemetries(Output.of(telemetries));
        }

        /**
         * @param telemetries An array that lists the types of telemetry data that this app monitor is to collect.
         * 
         * @return builder
         * 
         */
        public Builder telemetries(AppMonitorTelemetry... telemetries) {
            return telemetries(List.of(telemetries));
        }

        public AppMonitorConfigurationArgs build() {
            return $;
        }
    }

}
