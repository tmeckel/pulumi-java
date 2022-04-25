// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.appengine_v1beta.inputs.SslSettingsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainMappingArgs Empty = new DomainMappingArgs();

    @Import(name="appId", required=true)
    private Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }

    /**
     * Relative name of the domain serving the application. Example: example.com.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Relative name of the domain serving the application. Example: example.com.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="overrideStrategy")
    private @Nullable Output<String> overrideStrategy;

    public Optional<Output<String>> overrideStrategy() {
        return Optional.ofNullable(this.overrideStrategy);
    }

    /**
     * SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * 
     */
    @Import(name="sslSettings")
    private @Nullable Output<SslSettingsArgs> sslSettings;

    /**
     * @return SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * 
     */
    public Optional<Output<SslSettingsArgs>> sslSettings() {
        return Optional.ofNullable(this.sslSettings);
    }

    private DomainMappingArgs() {}

    private DomainMappingArgs(DomainMappingArgs $) {
        this.appId = $.appId;
        this.id = $.id;
        this.overrideStrategy = $.overrideStrategy;
        this.sslSettings = $.sslSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainMappingArgs $;

        public Builder() {
            $ = new DomainMappingArgs();
        }

        public Builder(DomainMappingArgs defaults) {
            $ = new DomainMappingArgs(Objects.requireNonNull(defaults));
        }

        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param id Relative name of the domain serving the application. Example: example.com.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Relative name of the domain serving the application. Example: example.com.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder overrideStrategy(@Nullable Output<String> overrideStrategy) {
            $.overrideStrategy = overrideStrategy;
            return this;
        }

        public Builder overrideStrategy(String overrideStrategy) {
            return overrideStrategy(Output.of(overrideStrategy));
        }

        /**
         * @param sslSettings SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
         * 
         * @return builder
         * 
         */
        public Builder sslSettings(@Nullable Output<SslSettingsArgs> sslSettings) {
            $.sslSettings = sslSettings;
            return this;
        }

        /**
         * @param sslSettings SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
         * 
         * @return builder
         * 
         */
        public Builder sslSettings(SslSettingsArgs sslSettings) {
            return sslSettings(Output.of(sslSettings));
        }

        public DomainMappingArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            return $;
        }
    }

}
