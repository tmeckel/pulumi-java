// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iap_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IdentityAwareProxyClientArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityAwareProxyClientArgs Empty = new IdentityAwareProxyClientArgs();

    @Import(name="brandId", required=true)
    private Output<String> brandId;

    public Output<String> brandId() {
        return this.brandId;
    }

    /**
     * Human-friendly name given to the OAuth client.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Human-friendly name given to the OAuth client.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private IdentityAwareProxyClientArgs() {}

    private IdentityAwareProxyClientArgs(IdentityAwareProxyClientArgs $) {
        this.brandId = $.brandId;
        this.displayName = $.displayName;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityAwareProxyClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityAwareProxyClientArgs $;

        public Builder() {
            $ = new IdentityAwareProxyClientArgs();
        }

        public Builder(IdentityAwareProxyClientArgs defaults) {
            $ = new IdentityAwareProxyClientArgs(Objects.requireNonNull(defaults));
        }

        public Builder brandId(Output<String> brandId) {
            $.brandId = brandId;
            return this;
        }

        public Builder brandId(String brandId) {
            return brandId(Output.of(brandId));
        }

        /**
         * @param displayName Human-friendly name given to the OAuth client.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Human-friendly name given to the OAuth client.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public IdentityAwareProxyClientArgs build() {
            $.brandId = Objects.requireNonNull($.brandId, "expected parameter 'brandId' to be non-null");
            return $;
        }
    }

}
