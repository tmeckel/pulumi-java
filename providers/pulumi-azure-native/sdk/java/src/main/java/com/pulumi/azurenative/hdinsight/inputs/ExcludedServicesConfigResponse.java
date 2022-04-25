// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration that services will be excluded when creating cluster.
 * 
 */
public final class ExcludedServicesConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExcludedServicesConfigResponse Empty = new ExcludedServicesConfigResponse();

    /**
     * The config id of excluded services.
     * 
     */
    @Import(name="excludedServicesConfigId")
    private @Nullable String excludedServicesConfigId;

    /**
     * @return The config id of excluded services.
     * 
     */
    public Optional<String> excludedServicesConfigId() {
        return Optional.ofNullable(this.excludedServicesConfigId);
    }

    /**
     * The list of excluded services.
     * 
     */
    @Import(name="excludedServicesList")
    private @Nullable String excludedServicesList;

    /**
     * @return The list of excluded services.
     * 
     */
    public Optional<String> excludedServicesList() {
        return Optional.ofNullable(this.excludedServicesList);
    }

    private ExcludedServicesConfigResponse() {}

    private ExcludedServicesConfigResponse(ExcludedServicesConfigResponse $) {
        this.excludedServicesConfigId = $.excludedServicesConfigId;
        this.excludedServicesList = $.excludedServicesList;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExcludedServicesConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExcludedServicesConfigResponse $;

        public Builder() {
            $ = new ExcludedServicesConfigResponse();
        }

        public Builder(ExcludedServicesConfigResponse defaults) {
            $ = new ExcludedServicesConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludedServicesConfigId The config id of excluded services.
         * 
         * @return builder
         * 
         */
        public Builder excludedServicesConfigId(@Nullable String excludedServicesConfigId) {
            $.excludedServicesConfigId = excludedServicesConfigId;
            return this;
        }

        /**
         * @param excludedServicesList The list of excluded services.
         * 
         * @return builder
         * 
         */
        public Builder excludedServicesList(@Nullable String excludedServicesList) {
            $.excludedServicesList = excludedServicesList;
            return this;
        }

        public ExcludedServicesConfigResponse build() {
            return $;
        }
    }

}
