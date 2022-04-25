// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DEPRECATED 1.9 - This group version of IPBlock is deprecated by networking/v1/IPBlock. IPBlock describes a particular CIDR (Ex. &#34;192.168.1.1/24&#34;) that is allowed to the pods matched by a NetworkPolicySpec&#39;s podSelector. The except entry describes CIDRs that should not be included within this rule.
 * 
 */
public final class IPBlockArgs extends com.pulumi.resources.ResourceArgs {

    public static final IPBlockArgs Empty = new IPBlockArgs();

    /**
     * CIDR is a string representing the IP Block Valid examples are &#34;192.168.1.1/24&#34;
     * 
     */
    @Import(name="cidr", required=true)
    private Output<String> cidr;

    /**
     * @return CIDR is a string representing the IP Block Valid examples are &#34;192.168.1.1/24&#34;
     * 
     */
    public Output<String> cidr() {
        return this.cidr;
    }

    /**
     * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are &#34;192.168.1.1/24&#34; Except values will be rejected if they are outside the CIDR range
     * 
     */
    @Import(name="except")
    private @Nullable Output<List<String>> except;

    /**
     * @return Except is a slice of CIDRs that should not be included within an IP Block Valid examples are &#34;192.168.1.1/24&#34; Except values will be rejected if they are outside the CIDR range
     * 
     */
    public Optional<Output<List<String>>> except() {
        return Optional.ofNullable(this.except);
    }

    private IPBlockArgs() {}

    private IPBlockArgs(IPBlockArgs $) {
        this.cidr = $.cidr;
        this.except = $.except;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPBlockArgs $;

        public Builder() {
            $ = new IPBlockArgs();
        }

        public Builder(IPBlockArgs defaults) {
            $ = new IPBlockArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr CIDR is a string representing the IP Block Valid examples are &#34;192.168.1.1/24&#34;
         * 
         * @return builder
         * 
         */
        public Builder cidr(Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr CIDR is a string representing the IP Block Valid examples are &#34;192.168.1.1/24&#34;
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param except Except is a slice of CIDRs that should not be included within an IP Block Valid examples are &#34;192.168.1.1/24&#34; Except values will be rejected if they are outside the CIDR range
         * 
         * @return builder
         * 
         */
        public Builder except(@Nullable Output<List<String>> except) {
            $.except = except;
            return this;
        }

        /**
         * @param except Except is a slice of CIDRs that should not be included within an IP Block Valid examples are &#34;192.168.1.1/24&#34; Except values will be rejected if they are outside the CIDR range
         * 
         * @return builder
         * 
         */
        public Builder except(List<String> except) {
            return except(Output.of(except));
        }

        /**
         * @param except Except is a slice of CIDRs that should not be included within an IP Block Valid examples are &#34;192.168.1.1/24&#34; Except values will be rejected if they are outside the CIDR range
         * 
         * @return builder
         * 
         */
        public Builder except(String... except) {
            return except(List.of(except));
        }

        public IPBlockArgs build() {
            $.cidr = Objects.requireNonNull($.cidr, "expected parameter 'cidr' to be non-null");
            return $;
        }
    }

}
