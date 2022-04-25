// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IpSetIpSetDescriptorGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpSetIpSetDescriptorGetArgs Empty = new IpSetIpSetDescriptorGetArgs();

    /**
     * The string like IPV4 or IPV6.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The string like IPV4 or IPV6.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The CIDR notation.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The CIDR notation.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private IpSetIpSetDescriptorGetArgs() {}

    private IpSetIpSetDescriptorGetArgs(IpSetIpSetDescriptorGetArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpSetIpSetDescriptorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpSetIpSetDescriptorGetArgs $;

        public Builder() {
            $ = new IpSetIpSetDescriptorGetArgs();
        }

        public Builder(IpSetIpSetDescriptorGetArgs defaults) {
            $ = new IpSetIpSetDescriptorGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The string like IPV4 or IPV6.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The string like IPV4 or IPV6.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public IpSetIpSetDescriptorGetArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
