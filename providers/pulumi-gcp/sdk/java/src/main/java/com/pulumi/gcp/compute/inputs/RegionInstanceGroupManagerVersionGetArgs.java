// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerVersionTargetSizeGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerVersionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerVersionGetArgs Empty = new RegionInstanceGroupManagerVersionGetArgs();

    /**
     * - The full URL to an instance template from which all new instances of this version will be created.
     * 
     */
    @Import(name="instanceTemplate", required=true)
    private Output<String> instanceTemplate;

    /**
     * @return - The full URL to an instance template from which all new instances of this version will be created.
     * 
     */
    public Output<String> instanceTemplate() {
        return this.instanceTemplate;
    }

    /**
     * - Version name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return - Version name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    @Import(name="targetSize")
    private @Nullable Output<RegionInstanceGroupManagerVersionTargetSizeGetArgs> targetSize;

    /**
     * @return - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    public Optional<Output<RegionInstanceGroupManagerVersionTargetSizeGetArgs>> targetSize() {
        return Optional.ofNullable(this.targetSize);
    }

    private RegionInstanceGroupManagerVersionGetArgs() {}

    private RegionInstanceGroupManagerVersionGetArgs(RegionInstanceGroupManagerVersionGetArgs $) {
        this.instanceTemplate = $.instanceTemplate;
        this.name = $.name;
        this.targetSize = $.targetSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionInstanceGroupManagerVersionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionInstanceGroupManagerVersionGetArgs $;

        public Builder() {
            $ = new RegionInstanceGroupManagerVersionGetArgs();
        }

        public Builder(RegionInstanceGroupManagerVersionGetArgs defaults) {
            $ = new RegionInstanceGroupManagerVersionGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceTemplate - The full URL to an instance template from which all new instances of this version will be created.
         * 
         * @return builder
         * 
         */
        public Builder instanceTemplate(Output<String> instanceTemplate) {
            $.instanceTemplate = instanceTemplate;
            return this;
        }

        /**
         * @param instanceTemplate - The full URL to an instance template from which all new instances of this version will be created.
         * 
         * @return builder
         * 
         */
        public Builder instanceTemplate(String instanceTemplate) {
            return instanceTemplate(Output.of(instanceTemplate));
        }

        /**
         * @param name - Version name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name - Version name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param targetSize - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder targetSize(@Nullable Output<RegionInstanceGroupManagerVersionTargetSizeGetArgs> targetSize) {
            $.targetSize = targetSize;
            return this;
        }

        /**
         * @param targetSize - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder targetSize(RegionInstanceGroupManagerVersionTargetSizeGetArgs targetSize) {
            return targetSize(Output.of(targetSize));
        }

        public RegionInstanceGroupManagerVersionGetArgs build() {
            $.instanceTemplate = Objects.requireNonNull($.instanceTemplate, "expected parameter 'instanceTemplate' to be non-null");
            return $;
        }
    }

}
