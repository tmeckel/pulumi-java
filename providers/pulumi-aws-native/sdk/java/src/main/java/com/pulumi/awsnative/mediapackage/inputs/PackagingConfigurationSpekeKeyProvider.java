// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
 * 
 */
public final class PackagingConfigurationSpekeKeyProvider extends com.pulumi.resources.InvokeArgs {

    public static final PackagingConfigurationSpekeKeyProvider Empty = new PackagingConfigurationSpekeKeyProvider();

    @Import(name="roleArn", required=true)
    private String roleArn;

    public String roleArn() {
        return this.roleArn;
    }

    /**
     * The system IDs to include in key requests.
     * 
     */
    @Import(name="systemIds", required=true)
    private List<String> systemIds;

    /**
     * @return The system IDs to include in key requests.
     * 
     */
    public List<String> systemIds() {
        return this.systemIds;
    }

    /**
     * The URL of the external key provider service.
     * 
     */
    @Import(name="url", required=true)
    private String url;

    /**
     * @return The URL of the external key provider service.
     * 
     */
    public String url() {
        return this.url;
    }

    private PackagingConfigurationSpekeKeyProvider() {}

    private PackagingConfigurationSpekeKeyProvider(PackagingConfigurationSpekeKeyProvider $) {
        this.roleArn = $.roleArn;
        this.systemIds = $.systemIds;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PackagingConfigurationSpekeKeyProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackagingConfigurationSpekeKeyProvider $;

        public Builder() {
            $ = new PackagingConfigurationSpekeKeyProvider();
        }

        public Builder(PackagingConfigurationSpekeKeyProvider defaults) {
            $ = new PackagingConfigurationSpekeKeyProvider(Objects.requireNonNull(defaults));
        }

        public Builder roleArn(String roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param systemIds The system IDs to include in key requests.
         * 
         * @return builder
         * 
         */
        public Builder systemIds(List<String> systemIds) {
            $.systemIds = systemIds;
            return this;
        }

        /**
         * @param systemIds The system IDs to include in key requests.
         * 
         * @return builder
         * 
         */
        public Builder systemIds(String... systemIds) {
            return systemIds(List.of(systemIds));
        }

        /**
         * @param url The URL of the external key provider service.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public PackagingConfigurationSpekeKeyProvider build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.systemIds = Objects.requireNonNull($.systemIds, "expected parameter 'systemIds' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
