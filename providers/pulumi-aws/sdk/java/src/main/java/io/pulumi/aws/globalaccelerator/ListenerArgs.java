// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator;

import io.pulumi.aws.globalaccelerator.inputs.ListenerPortRangeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerArgs Empty = new ListenerArgs();

    /**
     * The Amazon Resource Name (ARN) of your accelerator.
     * 
     */
    @Import(name="acceleratorArn", required=true)
      private final Output<String> acceleratorArn;

    public Output<String> getAcceleratorArn() {
        return this.acceleratorArn;
    }

    /**
     * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
     * 
     */
    @Import(name="clientAffinity")
      private final @Nullable Output<String> clientAffinity;

    public Output<String> getClientAffinity() {
        return this.clientAffinity == null ? Codegen.empty() : this.clientAffinity;
    }

    /**
     * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     * 
     */
    @Import(name="portRanges", required=true)
      private final Output<List<ListenerPortRangeArgs>> portRanges;

    public Output<List<ListenerPortRangeArgs>> getPortRanges() {
        return this.portRanges;
    }

    /**
     * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
     * 
     */
    @Import(name="protocol", required=true)
      private final Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol;
    }

    public ListenerArgs(
        Output<String> acceleratorArn,
        @Nullable Output<String> clientAffinity,
        Output<List<ListenerPortRangeArgs>> portRanges,
        Output<String> protocol) {
        this.acceleratorArn = Objects.requireNonNull(acceleratorArn, "expected parameter 'acceleratorArn' to be non-null");
        this.clientAffinity = clientAffinity;
        this.portRanges = Objects.requireNonNull(portRanges, "expected parameter 'portRanges' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private ListenerArgs() {
        this.acceleratorArn = Codegen.empty();
        this.clientAffinity = Codegen.empty();
        this.portRanges = Codegen.empty();
        this.protocol = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> acceleratorArn;
        private @Nullable Output<String> clientAffinity;
        private Output<List<ListenerPortRangeArgs>> portRanges;
        private Output<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorArn = defaults.acceleratorArn;
    	      this.clientAffinity = defaults.clientAffinity;
    	      this.portRanges = defaults.portRanges;
    	      this.protocol = defaults.protocol;
        }

        public Builder acceleratorArn(Output<String> acceleratorArn) {
            this.acceleratorArn = Objects.requireNonNull(acceleratorArn);
            return this;
        }
        public Builder acceleratorArn(String acceleratorArn) {
            this.acceleratorArn = Output.of(Objects.requireNonNull(acceleratorArn));
            return this;
        }
        public Builder clientAffinity(@Nullable Output<String> clientAffinity) {
            this.clientAffinity = clientAffinity;
            return this;
        }
        public Builder clientAffinity(@Nullable String clientAffinity) {
            this.clientAffinity = Codegen.ofNullable(clientAffinity);
            return this;
        }
        public Builder portRanges(Output<List<ListenerPortRangeArgs>> portRanges) {
            this.portRanges = Objects.requireNonNull(portRanges);
            return this;
        }
        public Builder portRanges(List<ListenerPortRangeArgs> portRanges) {
            this.portRanges = Output.of(Objects.requireNonNull(portRanges));
            return this;
        }
        public Builder portRanges(ListenerPortRangeArgs... portRanges) {
            return portRanges(List.of(portRanges));
        }
        public Builder protocol(Output<String> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Output.of(Objects.requireNonNull(protocol));
            return this;
        }        public ListenerArgs build() {
            return new ListenerArgs(acceleratorArn, clientAffinity, portRanges, protocol);
        }
    }
}
