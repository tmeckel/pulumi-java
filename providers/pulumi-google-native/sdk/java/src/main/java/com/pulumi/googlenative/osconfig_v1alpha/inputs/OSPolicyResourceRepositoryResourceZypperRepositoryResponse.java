// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a single zypper package repository. These are added to a repo file that is managed at `/etc/zypp/repos.d/google_osconfig.repo`.
 * 
 */
public final class OSPolicyResourceRepositoryResourceZypperRepositoryResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceRepositoryResourceZypperRepositoryResponse Empty = new OSPolicyResourceRepositoryResourceZypperRepositoryResponse();

    /**
     * The location of the repository directory.
     * 
     */
    @Import(name="baseUrl", required=true)
    private String baseUrl;

    /**
     * @return The location of the repository directory.
     * 
     */
    public String baseUrl() {
        return this.baseUrl;
    }

    /**
     * The display name of the repository.
     * 
     */
    @Import(name="displayName", required=true)
    private String displayName;

    /**
     * @return The display name of the repository.
     * 
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * URIs of GPG keys.
     * 
     */
    @Import(name="gpgKeys", required=true)
    private List<String> gpgKeys;

    /**
     * @return URIs of GPG keys.
     * 
     */
    public List<String> gpgKeys() {
        return this.gpgKeys;
    }

    private OSPolicyResourceRepositoryResourceZypperRepositoryResponse() {}

    private OSPolicyResourceRepositoryResourceZypperRepositoryResponse(OSPolicyResourceRepositoryResourceZypperRepositoryResponse $) {
        this.baseUrl = $.baseUrl;
        this.displayName = $.displayName;
        this.gpgKeys = $.gpgKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourceRepositoryResourceZypperRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceRepositoryResourceZypperRepositoryResponse $;

        public Builder() {
            $ = new OSPolicyResourceRepositoryResourceZypperRepositoryResponse();
        }

        public Builder(OSPolicyResourceRepositoryResourceZypperRepositoryResponse defaults) {
            $ = new OSPolicyResourceRepositoryResourceZypperRepositoryResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseUrl The location of the repository directory.
         * 
         * @return builder
         * 
         */
        public Builder baseUrl(String baseUrl) {
            $.baseUrl = baseUrl;
            return this;
        }

        /**
         * @param displayName The display name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param gpgKeys URIs of GPG keys.
         * 
         * @return builder
         * 
         */
        public Builder gpgKeys(List<String> gpgKeys) {
            $.gpgKeys = gpgKeys;
            return this;
        }

        /**
         * @param gpgKeys URIs of GPG keys.
         * 
         * @return builder
         * 
         */
        public Builder gpgKeys(String... gpgKeys) {
            return gpgKeys(List.of(gpgKeys));
        }

        public OSPolicyResourceRepositoryResourceZypperRepositoryResponse build() {
            $.baseUrl = Objects.requireNonNull($.baseUrl, "expected parameter 'baseUrl' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.gpgKeys = Objects.requireNonNull($.gpgKeys, "expected parameter 'gpgKeys' to be non-null");
            return $;
        }
    }

}
