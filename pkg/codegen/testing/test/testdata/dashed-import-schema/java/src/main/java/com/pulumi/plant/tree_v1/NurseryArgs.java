// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.plant.tree_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.plant.tree_v1.enums.RubberTreeVariety;
import com.pulumi.plant.tree_v1.enums.TreeSize;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NurseryArgs extends com.pulumi.resources.ResourceArgs {

    public static final NurseryArgs Empty = new NurseryArgs();

    /**
     * The sizes of trees available
     * 
     */
    @Import(name="sizes")
    private @Nullable Output<Map<String,TreeSize>> sizes;

    /**
     * @return The sizes of trees available
     * 
     */
    public Optional<Output<Map<String,TreeSize>>> sizes() {
        return Optional.ofNullable(this.sizes);
    }

    /**
     * The varieties available
     * 
     */
    @Import(name="varieties", required=true)
    private Output<List<RubberTreeVariety>> varieties;

    /**
     * @return The varieties available
     * 
     */
    public Output<List<RubberTreeVariety>> varieties() {
        return this.varieties;
    }

    private NurseryArgs() {}

    private NurseryArgs(NurseryArgs $) {
        this.sizes = $.sizes;
        this.varieties = $.varieties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NurseryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NurseryArgs $;

        public Builder() {
            $ = new NurseryArgs();
        }

        public Builder(NurseryArgs defaults) {
            $ = new NurseryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sizes The sizes of trees available
         * 
         * @return builder
         * 
         */
        public Builder sizes(@Nullable Output<Map<String,TreeSize>> sizes) {
            $.sizes = sizes;
            return this;
        }

        /**
         * @param sizes The sizes of trees available
         * 
         * @return builder
         * 
         */
        public Builder sizes(Map<String,TreeSize> sizes) {
            return sizes(Output.of(sizes));
        }

        /**
         * @param varieties The varieties available
         * 
         * @return builder
         * 
         */
        public Builder varieties(Output<List<RubberTreeVariety>> varieties) {
            $.varieties = varieties;
            return this;
        }

        /**
         * @param varieties The varieties available
         * 
         * @return builder
         * 
         */
        public Builder varieties(List<RubberTreeVariety> varieties) {
            return varieties(Output.of(varieties));
        }

        /**
         * @param varieties The varieties available
         * 
         * @return builder
         * 
         */
        public Builder varieties(RubberTreeVariety... varieties) {
            return varieties(List.of(varieties));
        }

        public NurseryArgs build() {
            $.varieties = Objects.requireNonNull($.varieties, "expected parameter 'varieties' to be non-null");
            return $;
        }
    }

}
