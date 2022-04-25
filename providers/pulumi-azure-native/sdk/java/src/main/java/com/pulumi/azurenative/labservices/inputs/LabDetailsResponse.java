// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This represents the details about a lab that the User is in, and its state.
 * 
 */
public final class LabDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final LabDetailsResponse Empty = new LabDetailsResponse();

    /**
     * The Id of the lab.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The Id of the lab.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name of the lab
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the lab
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the lab.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable String provisioningState;

    /**
     * @return The provisioning state of the lab.
     * 
     */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * The maximum duration a user can use a VM in this lab.
     * 
     */
    @Import(name="usageQuota", required=true)
    private String usageQuota;

    /**
     * @return The maximum duration a user can use a VM in this lab.
     * 
     */
    public String usageQuota() {
        return this.usageQuota;
    }

    private LabDetailsResponse() {}

    private LabDetailsResponse(LabDetailsResponse $) {
        this.id = $.id;
        this.name = $.name;
        this.provisioningState = $.provisioningState;
        this.usageQuota = $.usageQuota;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabDetailsResponse $;

        public Builder() {
            $ = new LabDetailsResponse();
        }

        public Builder(LabDetailsResponse defaults) {
            $ = new LabDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The Id of the lab.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name Name of the lab
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param provisioningState The provisioning state of the lab.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param usageQuota The maximum duration a user can use a VM in this lab.
         * 
         * @return builder
         * 
         */
        public Builder usageQuota(String usageQuota) {
            $.usageQuota = usageQuota;
            return this;
        }

        public LabDetailsResponse build() {
            $.usageQuota = Objects.requireNonNull($.usageQuota, "expected parameter 'usageQuota' to be non-null");
            return $;
        }
    }

}
