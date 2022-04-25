// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents an OpenShift router
 * 
 */
public final class OpenShiftRouterProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final OpenShiftRouterProfileResponse Empty = new OpenShiftRouterProfileResponse();

    /**
     * Auto-allocated FQDN for the OpenShift router.
     * 
     */
    @Import(name="fqdn", required=true)
    private String fqdn;

    /**
     * @return Auto-allocated FQDN for the OpenShift router.
     * 
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Name of the router profile.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the router profile.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * DNS subdomain for OpenShift router.
     * 
     */
    @Import(name="publicSubdomain", required=true)
    private String publicSubdomain;

    /**
     * @return DNS subdomain for OpenShift router.
     * 
     */
    public String publicSubdomain() {
        return this.publicSubdomain;
    }

    private OpenShiftRouterProfileResponse() {}

    private OpenShiftRouterProfileResponse(OpenShiftRouterProfileResponse $) {
        this.fqdn = $.fqdn;
        this.name = $.name;
        this.publicSubdomain = $.publicSubdomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenShiftRouterProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenShiftRouterProfileResponse $;

        public Builder() {
            $ = new OpenShiftRouterProfileResponse();
        }

        public Builder(OpenShiftRouterProfileResponse defaults) {
            $ = new OpenShiftRouterProfileResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param fqdn Auto-allocated FQDN for the OpenShift router.
         * 
         * @return builder
         * 
         */
        public Builder fqdn(String fqdn) {
            $.fqdn = fqdn;
            return this;
        }

        /**
         * @param name Name of the router profile.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param publicSubdomain DNS subdomain for OpenShift router.
         * 
         * @return builder
         * 
         */
        public Builder publicSubdomain(String publicSubdomain) {
            $.publicSubdomain = publicSubdomain;
            return this;
        }

        public OpenShiftRouterProfileResponse build() {
            $.fqdn = Objects.requireNonNull($.fqdn, "expected parameter 'fqdn' to be non-null");
            $.publicSubdomain = Objects.requireNonNull($.publicSubdomain, "expected parameter 'publicSubdomain' to be non-null");
            return $;
        }
    }

}
