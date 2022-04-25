// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class RouteSpecGrpcRouteMatchMetadataMatchRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecGrpcRouteMatchMetadataMatchRangeArgs Empty = new RouteSpecGrpcRouteMatchMetadataMatchRangeArgs();

    /**
     * The end of the range.
     * 
     */
    @Import(name="end", required=true)
    private Output<Integer> end;

    /**
     * @return The end of the range.
     * 
     */
    public Output<Integer> end() {
        return this.end;
    }

    /**
     * The start of the range.
     * 
     */
    @Import(name="start", required=true)
    private Output<Integer> start;

    /**
     * @return The start of the range.
     * 
     */
    public Output<Integer> start() {
        return this.start;
    }

    private RouteSpecGrpcRouteMatchMetadataMatchRangeArgs() {}

    private RouteSpecGrpcRouteMatchMetadataMatchRangeArgs(RouteSpecGrpcRouteMatchMetadataMatchRangeArgs $) {
        this.end = $.end;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecGrpcRouteMatchMetadataMatchRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecGrpcRouteMatchMetadataMatchRangeArgs $;

        public Builder() {
            $ = new RouteSpecGrpcRouteMatchMetadataMatchRangeArgs();
        }

        public Builder(RouteSpecGrpcRouteMatchMetadataMatchRangeArgs defaults) {
            $ = new RouteSpecGrpcRouteMatchMetadataMatchRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param end The end of the range.
         * 
         * @return builder
         * 
         */
        public Builder end(Output<Integer> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end The end of the range.
         * 
         * @return builder
         * 
         */
        public Builder end(Integer end) {
            return end(Output.of(end));
        }

        /**
         * @param start The start of the range.
         * 
         * @return builder
         * 
         */
        public Builder start(Output<Integer> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start The start of the range.
         * 
         * @return builder
         * 
         */
        public Builder start(Integer start) {
            return start(Output.of(start));
        }

        public RouteSpecGrpcRouteMatchMetadataMatchRangeArgs build() {
            $.end = Objects.requireNonNull($.end, "expected parameter 'end' to be non-null");
            $.start = Objects.requireNonNull($.start, "expected parameter 'start' to be non-null");
            return $;
        }
    }

}
