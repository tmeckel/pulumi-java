// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.ExtensionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a cloud service extension profile.
 * 
 */
public final class CloudServiceExtensionProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudServiceExtensionProfileArgs Empty = new CloudServiceExtensionProfileArgs();

    /**
     * List of extensions for the cloud service.
     * 
     */
    @Import(name="extensions")
    private @Nullable Output<List<ExtensionArgs>> extensions;

    /**
     * @return List of extensions for the cloud service.
     * 
     */
    public Optional<Output<List<ExtensionArgs>>> extensions() {
        return Optional.ofNullable(this.extensions);
    }

    private CloudServiceExtensionProfileArgs() {}

    private CloudServiceExtensionProfileArgs(CloudServiceExtensionProfileArgs $) {
        this.extensions = $.extensions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudServiceExtensionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudServiceExtensionProfileArgs $;

        public Builder() {
            $ = new CloudServiceExtensionProfileArgs();
        }

        public Builder(CloudServiceExtensionProfileArgs defaults) {
            $ = new CloudServiceExtensionProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param extensions List of extensions for the cloud service.
         * 
         * @return builder
         * 
         */
        public Builder extensions(@Nullable Output<List<ExtensionArgs>> extensions) {
            $.extensions = extensions;
            return this;
        }

        /**
         * @param extensions List of extensions for the cloud service.
         * 
         * @return builder
         * 
         */
        public Builder extensions(List<ExtensionArgs> extensions) {
            return extensions(Output.of(extensions));
        }

        /**
         * @param extensions List of extensions for the cloud service.
         * 
         * @return builder
         * 
         */
        public Builder extensions(ExtensionArgs... extensions) {
            return extensions(List.of(extensions));
        }

        public CloudServiceExtensionProfileArgs build() {
            return $;
        }
    }

}
