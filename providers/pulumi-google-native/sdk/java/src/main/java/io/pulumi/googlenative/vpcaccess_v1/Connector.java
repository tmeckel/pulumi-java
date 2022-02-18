// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vpcaccess_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vpcaccess_v1.ConnectorArgs;
import io.pulumi.googlenative.vpcaccess_v1.outputs.SubnetResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a Serverless VPC Access connector, returns an operation.
 * 
 */
@ResourceType(type="google-native:vpcaccess/v1:Connector")
public class Connector extends io.pulumi.resources.CustomResource {
    /**
     * List of projects using the connector.
     * 
     */
    @OutputExport(name="connectedProjects", type=List.class, parameters={String.class})
    private Output<List<String>> connectedProjects;

    /**
     * @return List of projects using the connector.
     * 
     */
    public Output<List<String>> getConnectedProjects() {
        return this.connectedProjects;
    }
    /**
     * The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
     * 
     */
    @OutputExport(name="ipCidrRange", type=String.class, parameters={})
    private Output<String> ipCidrRange;

    /**
     * @return The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
     * 
     */
    public Output<String> getIpCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * Machine type of VM Instance underlying connector. Default is e2-micro
     * 
     */
    @OutputExport(name="machineType", type=String.class, parameters={})
    private Output<String> machineType;

    /**
     * @return Machine type of VM Instance underlying connector. Default is e2-micro
     * 
     */
    public Output<String> getMachineType() {
        return this.machineType;
    }
    /**
     * Maximum value of instances in autoscaling group underlying the connector.
     * 
     */
    @OutputExport(name="maxInstances", type=Integer.class, parameters={})
    private Output<Integer> maxInstances;

    /**
     * @return Maximum value of instances in autoscaling group underlying the connector.
     * 
     */
    public Output<Integer> getMaxInstances() {
        return this.maxInstances;
    }
    /**
     * Maximum throughput of the connector in Mbps. Default is 300, max is 1000.
     * 
     */
    @OutputExport(name="maxThroughput", type=Integer.class, parameters={})
    private Output<Integer> maxThroughput;

    /**
     * @return Maximum throughput of the connector in Mbps. Default is 300, max is 1000.
     * 
     */
    public Output<Integer> getMaxThroughput() {
        return this.maxThroughput;
    }
    /**
     * Minimum value of instances in autoscaling group underlying the connector.
     * 
     */
    @OutputExport(name="minInstances", type=Integer.class, parameters={})
    private Output<Integer> minInstances;

    /**
     * @return Minimum value of instances in autoscaling group underlying the connector.
     * 
     */
    public Output<Integer> getMinInstances() {
        return this.minInstances;
    }
    /**
     * Minimum throughput of the connector in Mbps. Default and min is 200.
     * 
     */
    @OutputExport(name="minThroughput", type=Integer.class, parameters={})
    private Output<Integer> minThroughput;

    /**
     * @return Minimum throughput of the connector in Mbps. Default and min is 200.
     * 
     */
    public Output<Integer> getMinThroughput() {
        return this.minThroughput;
    }
    /**
     * The resource name in the format `projects/*{@literal /}locations/*{@literal /}connectors/*`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name in the format `projects/*{@literal /}locations/*{@literal /}connectors/*`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Name of a VPC network.
     * 
     */
    @OutputExport(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return Name of a VPC network.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * State of the VPC access connector.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the VPC access connector.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The subnet in which to house the VPC Access Connector.
     * 
     */
    @OutputExport(name="subnet", type=SubnetResponse.class, parameters={})
    private Output<SubnetResponse> subnet;

    /**
     * @return The subnet in which to house the VPC Access Connector.
     * 
     */
    public Output<SubnetResponse> getSubnet() {
        return this.subnet;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connector(String name, ConnectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vpcaccess/v1:Connector", name, args == null ? ConnectorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Connector(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vpcaccess/v1:Connector", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Connector get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Connector(name, id, options);
    }
}
