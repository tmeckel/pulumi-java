// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.AbortInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.CloudSQLInstanceInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.DeliverInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.DropInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.EndpointInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.FirewallInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.ForwardInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.ForwardingRuleInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.GKEMasterInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.InstanceInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.LoadBalancerInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.NetworkInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.RouteInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.VpnGatewayInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.VpnTunnelInfoResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A simulated forwarding path is composed of multiple steps. Each step has a well-defined state and an associated configuration.
 * 
 */
public final class StepResponse extends io.pulumi.resources.InvokeArgs {

    public static final StepResponse Empty = new StepResponse();

    /**
     * Display information of the final state "abort" and reason.
     * 
     */
    @InputImport(name="abort", required=true)
      private final AbortInfoResponse abort;

    public AbortInfoResponse getAbort() {
        return this.abort;
    }

    /**
     * This is a step that leads to the final state Drop.
     * 
     */
    @InputImport(name="causesDrop", required=true)
      private final Boolean causesDrop;

    public Boolean getCausesDrop() {
        return this.causesDrop;
    }

    /**
     * Display information of a Cloud SQL instance.
     * 
     */
    @InputImport(name="cloudSqlInstance", required=true)
      private final CloudSQLInstanceInfoResponse cloudSqlInstance;

    public CloudSQLInstanceInfoResponse getCloudSqlInstance() {
        return this.cloudSqlInstance;
    }

    /**
     * Display information of the final state "deliver" and reason.
     * 
     */
    @InputImport(name="deliver", required=true)
      private final DeliverInfoResponse deliver;

    public DeliverInfoResponse getDeliver() {
        return this.deliver;
    }

    /**
     * A description of the step. Usually this is a summary of the state.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * Display information of the final state "drop" and reason.
     * 
     */
    @InputImport(name="drop", required=true)
      private final DropInfoResponse drop;

    public DropInfoResponse getDrop() {
        return this.drop;
    }

    /**
     * Display information of the source and destination under analysis. The endpoint information in an intermediate state may differ with the initial input, as it might be modified by state like NAT, or Connection Proxy.
     * 
     */
    @InputImport(name="endpoint", required=true)
      private final EndpointInfoResponse endpoint;

    public EndpointInfoResponse getEndpoint() {
        return this.endpoint;
    }

    /**
     * Display information of a Compute Engine firewall rule.
     * 
     */
    @InputImport(name="firewall", required=true)
      private final FirewallInfoResponse firewall;

    public FirewallInfoResponse getFirewall() {
        return this.firewall;
    }

    /**
     * Display information of the final state "forward" and reason.
     * 
     */
    @InputImport(name="forward", required=true)
      private final ForwardInfoResponse forward;

    public ForwardInfoResponse getForward() {
        return this.forward;
    }

    /**
     * Display information of a Compute Engine forwarding rule.
     * 
     */
    @InputImport(name="forwardingRule", required=true)
      private final ForwardingRuleInfoResponse forwardingRule;

    public ForwardingRuleInfoResponse getForwardingRule() {
        return this.forwardingRule;
    }

    /**
     * Display information of a Google Kubernetes Engine cluster master.
     * 
     */
    @InputImport(name="gkeMaster", required=true)
      private final GKEMasterInfoResponse gkeMaster;

    public GKEMasterInfoResponse getGkeMaster() {
        return this.gkeMaster;
    }

    /**
     * Display information of a Compute Engine instance.
     * 
     */
    @InputImport(name="instance", required=true)
      private final InstanceInfoResponse instance;

    public InstanceInfoResponse getInstance() {
        return this.instance;
    }

    /**
     * Display information of the load balancers.
     * 
     */
    @InputImport(name="loadBalancer", required=true)
      private final LoadBalancerInfoResponse loadBalancer;

    public LoadBalancerInfoResponse getLoadBalancer() {
        return this.loadBalancer;
    }

    /**
     * Display information of a Google Cloud network.
     * 
     */
    @InputImport(name="network", required=true)
      private final NetworkInfoResponse network;

    public NetworkInfoResponse getNetwork() {
        return this.network;
    }

    /**
     * Project ID that contains the configuration this step is validating.
     * 
     */
    @InputImport(name="project", required=true)
      private final String project;

    public String getProject() {
        return this.project;
    }

    /**
     * Display information of a Compute Engine route.
     * 
     */
    @InputImport(name="route", required=true)
      private final RouteInfoResponse route;

    public RouteInfoResponse getRoute() {
        return this.route;
    }

    /**
     * Each step is in one of the pre-defined states.
     * 
     */
    @InputImport(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Display information of a Compute Engine VPN gateway.
     * 
     */
    @InputImport(name="vpnGateway", required=true)
      private final VpnGatewayInfoResponse vpnGateway;

    public VpnGatewayInfoResponse getVpnGateway() {
        return this.vpnGateway;
    }

    /**
     * Display information of a Compute Engine VPN tunnel.
     * 
     */
    @InputImport(name="vpnTunnel", required=true)
      private final VpnTunnelInfoResponse vpnTunnel;

    public VpnTunnelInfoResponse getVpnTunnel() {
        return this.vpnTunnel;
    }

    public StepResponse(
        AbortInfoResponse abort,
        Boolean causesDrop,
        CloudSQLInstanceInfoResponse cloudSqlInstance,
        DeliverInfoResponse deliver,
        String description,
        DropInfoResponse drop,
        EndpointInfoResponse endpoint,
        FirewallInfoResponse firewall,
        ForwardInfoResponse forward,
        ForwardingRuleInfoResponse forwardingRule,
        GKEMasterInfoResponse gkeMaster,
        InstanceInfoResponse instance,
        LoadBalancerInfoResponse loadBalancer,
        NetworkInfoResponse network,
        String project,
        RouteInfoResponse route,
        String state,
        VpnGatewayInfoResponse vpnGateway,
        VpnTunnelInfoResponse vpnTunnel) {
        this.abort = Objects.requireNonNull(abort, "expected parameter 'abort' to be non-null");
        this.causesDrop = Objects.requireNonNull(causesDrop, "expected parameter 'causesDrop' to be non-null");
        this.cloudSqlInstance = Objects.requireNonNull(cloudSqlInstance, "expected parameter 'cloudSqlInstance' to be non-null");
        this.deliver = Objects.requireNonNull(deliver, "expected parameter 'deliver' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.drop = Objects.requireNonNull(drop, "expected parameter 'drop' to be non-null");
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.firewall = Objects.requireNonNull(firewall, "expected parameter 'firewall' to be non-null");
        this.forward = Objects.requireNonNull(forward, "expected parameter 'forward' to be non-null");
        this.forwardingRule = Objects.requireNonNull(forwardingRule, "expected parameter 'forwardingRule' to be non-null");
        this.gkeMaster = Objects.requireNonNull(gkeMaster, "expected parameter 'gkeMaster' to be non-null");
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.loadBalancer = Objects.requireNonNull(loadBalancer, "expected parameter 'loadBalancer' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.route = Objects.requireNonNull(route, "expected parameter 'route' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.vpnGateway = Objects.requireNonNull(vpnGateway, "expected parameter 'vpnGateway' to be non-null");
        this.vpnTunnel = Objects.requireNonNull(vpnTunnel, "expected parameter 'vpnTunnel' to be non-null");
    }

    private StepResponse() {
        this.abort = null;
        this.causesDrop = null;
        this.cloudSqlInstance = null;
        this.deliver = null;
        this.description = null;
        this.drop = null;
        this.endpoint = null;
        this.firewall = null;
        this.forward = null;
        this.forwardingRule = null;
        this.gkeMaster = null;
        this.instance = null;
        this.loadBalancer = null;
        this.network = null;
        this.project = null;
        this.route = null;
        this.state = null;
        this.vpnGateway = null;
        this.vpnTunnel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AbortInfoResponse abort;
        private Boolean causesDrop;
        private CloudSQLInstanceInfoResponse cloudSqlInstance;
        private DeliverInfoResponse deliver;
        private String description;
        private DropInfoResponse drop;
        private EndpointInfoResponse endpoint;
        private FirewallInfoResponse firewall;
        private ForwardInfoResponse forward;
        private ForwardingRuleInfoResponse forwardingRule;
        private GKEMasterInfoResponse gkeMaster;
        private InstanceInfoResponse instance;
        private LoadBalancerInfoResponse loadBalancer;
        private NetworkInfoResponse network;
        private String project;
        private RouteInfoResponse route;
        private String state;
        private VpnGatewayInfoResponse vpnGateway;
        private VpnTunnelInfoResponse vpnTunnel;

        public Builder() {
    	      // Empty
        }

        public Builder(StepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.causesDrop = defaults.causesDrop;
    	      this.cloudSqlInstance = defaults.cloudSqlInstance;
    	      this.deliver = defaults.deliver;
    	      this.description = defaults.description;
    	      this.drop = defaults.drop;
    	      this.endpoint = defaults.endpoint;
    	      this.firewall = defaults.firewall;
    	      this.forward = defaults.forward;
    	      this.forwardingRule = defaults.forwardingRule;
    	      this.gkeMaster = defaults.gkeMaster;
    	      this.instance = defaults.instance;
    	      this.loadBalancer = defaults.loadBalancer;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.route = defaults.route;
    	      this.state = defaults.state;
    	      this.vpnGateway = defaults.vpnGateway;
    	      this.vpnTunnel = defaults.vpnTunnel;
        }

        public Builder abort(AbortInfoResponse abort) {
            this.abort = Objects.requireNonNull(abort);
            return this;
        }

        public Builder causesDrop(Boolean causesDrop) {
            this.causesDrop = Objects.requireNonNull(causesDrop);
            return this;
        }

        public Builder cloudSqlInstance(CloudSQLInstanceInfoResponse cloudSqlInstance) {
            this.cloudSqlInstance = Objects.requireNonNull(cloudSqlInstance);
            return this;
        }

        public Builder deliver(DeliverInfoResponse deliver) {
            this.deliver = Objects.requireNonNull(deliver);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder drop(DropInfoResponse drop) {
            this.drop = Objects.requireNonNull(drop);
            return this;
        }

        public Builder endpoint(EndpointInfoResponse endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder firewall(FirewallInfoResponse firewall) {
            this.firewall = Objects.requireNonNull(firewall);
            return this;
        }

        public Builder forward(ForwardInfoResponse forward) {
            this.forward = Objects.requireNonNull(forward);
            return this;
        }

        public Builder forwardingRule(ForwardingRuleInfoResponse forwardingRule) {
            this.forwardingRule = Objects.requireNonNull(forwardingRule);
            return this;
        }

        public Builder gkeMaster(GKEMasterInfoResponse gkeMaster) {
            this.gkeMaster = Objects.requireNonNull(gkeMaster);
            return this;
        }

        public Builder instance(InstanceInfoResponse instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder loadBalancer(LoadBalancerInfoResponse loadBalancer) {
            this.loadBalancer = Objects.requireNonNull(loadBalancer);
            return this;
        }

        public Builder network(NetworkInfoResponse network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder route(RouteInfoResponse route) {
            this.route = Objects.requireNonNull(route);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder vpnGateway(VpnGatewayInfoResponse vpnGateway) {
            this.vpnGateway = Objects.requireNonNull(vpnGateway);
            return this;
        }

        public Builder vpnTunnel(VpnTunnelInfoResponse vpnTunnel) {
            this.vpnTunnel = Objects.requireNonNull(vpnTunnel);
            return this;
        }
        public StepResponse build() {
            return new StepResponse(abort, causesDrop, cloudSqlInstance, deliver, description, drop, endpoint, firewall, forward, forwardingRule, gkeMaster, instance, loadBalancer, network, project, route, state, vpnGateway, vpnTunnel);
        }
    }
}
