// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.inputs;

import com.pulumi.aws.waf.inputs.IpSetIpSetDescriptorGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpSetState extends com.pulumi.resources.ResourceArgs {

    public static final IpSetState Empty = new IpSetState();

    /**
     * The ARN of the WAF IPSet.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the WAF IPSet.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
     * 
     */
    @Import(name="ipSetDescriptors")
    private @Nullable Output<List<IpSetIpSetDescriptorGetArgs>> ipSetDescriptors;

    /**
     * @return One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
     * 
     */
    public Optional<Output<List<IpSetIpSetDescriptorGetArgs>>> ipSetDescriptors() {
        return Optional.ofNullable(this.ipSetDescriptors);
    }

    /**
     * The name or description of the IPSet.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name or description of the IPSet.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private IpSetState() {}

    private IpSetState(IpSetState $) {
        this.arn = $.arn;
        this.ipSetDescriptors = $.ipSetDescriptors;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpSetState $;

        public Builder() {
            $ = new IpSetState();
        }

        public Builder(IpSetState defaults) {
            $ = new IpSetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the WAF IPSet.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the WAF IPSet.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param ipSetDescriptors One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
         * 
         * @return builder
         * 
         */
        public Builder ipSetDescriptors(@Nullable Output<List<IpSetIpSetDescriptorGetArgs>> ipSetDescriptors) {
            $.ipSetDescriptors = ipSetDescriptors;
            return this;
        }

        /**
         * @param ipSetDescriptors One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
         * 
         * @return builder
         * 
         */
        public Builder ipSetDescriptors(List<IpSetIpSetDescriptorGetArgs> ipSetDescriptors) {
            return ipSetDescriptors(Output.of(ipSetDescriptors));
        }

        /**
         * @param ipSetDescriptors One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
         * 
         * @return builder
         * 
         */
        public Builder ipSetDescriptors(IpSetIpSetDescriptorGetArgs... ipSetDescriptors) {
            return ipSetDescriptors(List.of(ipSetDescriptors));
        }

        /**
         * @param name The name or description of the IPSet.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name or description of the IPSet.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public IpSetState build() {
            return $;
        }
    }

}
