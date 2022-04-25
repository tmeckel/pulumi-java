// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the move collection properties.
 * 
 */
public final class MoveCollectionPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MoveCollectionPropertiesArgs Empty = new MoveCollectionPropertiesArgs();

    /**
     * Gets or sets the source region.
     * 
     */
    @Import(name="sourceRegion", required=true)
    private Output<String> sourceRegion;

    /**
     * @return Gets or sets the source region.
     * 
     */
    public Output<String> sourceRegion() {
        return this.sourceRegion;
    }

    /**
     * Gets or sets the target region.
     * 
     */
    @Import(name="targetRegion", required=true)
    private Output<String> targetRegion;

    /**
     * @return Gets or sets the target region.
     * 
     */
    public Output<String> targetRegion() {
        return this.targetRegion;
    }

    private MoveCollectionPropertiesArgs() {}

    private MoveCollectionPropertiesArgs(MoveCollectionPropertiesArgs $) {
        this.sourceRegion = $.sourceRegion;
        this.targetRegion = $.targetRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MoveCollectionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MoveCollectionPropertiesArgs $;

        public Builder() {
            $ = new MoveCollectionPropertiesArgs();
        }

        public Builder(MoveCollectionPropertiesArgs defaults) {
            $ = new MoveCollectionPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sourceRegion Gets or sets the source region.
         * 
         * @return builder
         * 
         */
        public Builder sourceRegion(Output<String> sourceRegion) {
            $.sourceRegion = sourceRegion;
            return this;
        }

        /**
         * @param sourceRegion Gets or sets the source region.
         * 
         * @return builder
         * 
         */
        public Builder sourceRegion(String sourceRegion) {
            return sourceRegion(Output.of(sourceRegion));
        }

        /**
         * @param targetRegion Gets or sets the target region.
         * 
         * @return builder
         * 
         */
        public Builder targetRegion(Output<String> targetRegion) {
            $.targetRegion = targetRegion;
            return this;
        }

        /**
         * @param targetRegion Gets or sets the target region.
         * 
         * @return builder
         * 
         */
        public Builder targetRegion(String targetRegion) {
            return targetRegion(Output.of(targetRegion));
        }

        public MoveCollectionPropertiesArgs build() {
            $.sourceRegion = Objects.requireNonNull($.sourceRegion, "expected parameter 'sourceRegion' to be non-null");
            $.targetRegion = Objects.requireNonNull($.targetRegion, "expected parameter 'targetRegion' to be non-null");
            return $;
        }
    }

}
