// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.ec2.inputs.InternetGatewayTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InternetGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final InternetGatewayArgs Empty = new InternetGatewayArgs();

    /**
     * Any tags to assign to the internet gateway.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<InternetGatewayTagArgs>> tags;

    /**
     * @return Any tags to assign to the internet gateway.
     * 
     */
    public Optional<Output<List<InternetGatewayTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private InternetGatewayArgs() {}

    private InternetGatewayArgs(InternetGatewayArgs $) {
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InternetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InternetGatewayArgs $;

        public Builder() {
            $ = new InternetGatewayArgs();
        }

        public Builder(InternetGatewayArgs defaults) {
            $ = new InternetGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tags Any tags to assign to the internet gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<InternetGatewayTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Any tags to assign to the internet gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<InternetGatewayTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Any tags to assign to the internet gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(InternetGatewayTagArgs... tags) {
            return tags(List.of(tags));
        }

        public InternetGatewayArgs build() {
            return $;
        }
    }

}
