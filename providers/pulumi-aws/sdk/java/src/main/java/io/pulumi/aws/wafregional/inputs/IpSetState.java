// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.IpSetIpSetDescriptorGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IpSetState extends io.pulumi.resources.ResourceArgs {

    public static final IpSetState Empty = new IpSetState();

    /**
     * The ARN of the WAF IPSet.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) from which web requests originate.
     * 
     */
    @InputImport(name="ipSetDescriptors")
      private final @Nullable Input<List<IpSetIpSetDescriptorGetArgs>> ipSetDescriptors;

    public Input<List<IpSetIpSetDescriptorGetArgs>> getIpSetDescriptors() {
        return this.ipSetDescriptors == null ? Input.empty() : this.ipSetDescriptors;
    }

    /**
     * The name or description of the IPSet.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public IpSetState(
        @Nullable Input<String> arn,
        @Nullable Input<List<IpSetIpSetDescriptorGetArgs>> ipSetDescriptors,
        @Nullable Input<String> name) {
        this.arn = arn;
        this.ipSetDescriptors = ipSetDescriptors;
        this.name = name;
    }

    private IpSetState() {
        this.arn = Input.empty();
        this.ipSetDescriptors = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<IpSetIpSetDescriptorGetArgs>> ipSetDescriptors;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(IpSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ipSetDescriptors = defaults.ipSetDescriptors;
    	      this.name = defaults.name;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder ipSetDescriptors(@Nullable Input<List<IpSetIpSetDescriptorGetArgs>> ipSetDescriptors) {
            this.ipSetDescriptors = ipSetDescriptors;
            return this;
        }

        public Builder ipSetDescriptors(@Nullable List<IpSetIpSetDescriptorGetArgs> ipSetDescriptors) {
            this.ipSetDescriptors = Input.ofNullable(ipSetDescriptors);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public IpSetState build() {
            return new IpSetState(arn, ipSetDescriptors, name);
        }
    }
}
