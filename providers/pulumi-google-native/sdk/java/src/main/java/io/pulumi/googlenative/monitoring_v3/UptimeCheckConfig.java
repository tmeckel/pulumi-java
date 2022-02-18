// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.monitoring_v3.UptimeCheckConfigArgs;
import io.pulumi.googlenative.monitoring_v3.outputs.ContentMatcherResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.HttpCheckResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.InternalCheckerResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.MonitoredResourceResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.ResourceGroupResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.TcpCheckResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new Uptime check configuration.
 * 
 */
@ResourceType(type="google-native:monitoring/v3:UptimeCheckConfig")
public class UptimeCheckConfig extends io.pulumi.resources.CustomResource {
    /**
     * The type of checkers to use to execute the Uptime check.
     * 
     */
    @OutputExport(name="checkerType", type=String.class, parameters={})
    private Output<String> checkerType;

    /**
     * @return The type of checkers to use to execute the Uptime check.
     * 
     */
    public Output<String> getCheckerType() {
        return this.checkerType;
    }
    /**
     * The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
     * 
     */
    @OutputExport(name="contentMatchers", type=List.class, parameters={ContentMatcherResponse.class})
    private Output<List<ContentMatcherResponse>> contentMatchers;

    /**
     * @return The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
     * 
     */
    public Output<List<ContentMatcherResponse>> getContentMatchers() {
        return this.contentMatchers;
    }
    /**
     * A human-friendly name for the Uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced. Required.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A human-friendly name for the Uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced. Required.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Contains information needed to make an HTTP or HTTPS check.
     * 
     */
    @OutputExport(name="httpCheck", type=HttpCheckResponse.class, parameters={})
    private Output<HttpCheckResponse> httpCheck;

    /**
     * @return Contains information needed to make an HTTP or HTTPS check.
     * 
     */
    public Output<HttpCheckResponse> getHttpCheck() {
        return this.httpCheck;
    }
    /**
     * The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project that owns this UptimeCheckConfig.
     * 
     */
    @OutputExport(name="internalCheckers", type=List.class, parameters={InternalCheckerResponse.class})
    private Output<List<InternalCheckerResponse>> internalCheckers;

    /**
     * @return The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project that owns this UptimeCheckConfig.
     * 
     */
    public Output<List<InternalCheckerResponse>> getInternalCheckers() {
        return this.internalCheckers;
    }
    /**
     * If this is true, then checks are made only from the 'internal_checkers'. If it is false, then checks are made only from the 'selected_regions'. It is an error to provide 'selected_regions' when is_internal is true, or to provide 'internal_checkers' when is_internal is false.
     * 
     */
    @OutputExport(name="isInternal", type=Boolean.class, parameters={})
    private Output<Boolean> isInternal;

    /**
     * @return If this is true, then checks are made only from the 'internal_checkers'. If it is false, then checks are made only from the 'selected_regions'. It is an error to provide 'selected_regions' when is_internal is true, or to provide 'internal_checkers' when is_internal is false.
     * 
     */
    public Output<Boolean> getIsInternal() {
        return this.isInternal;
    }
    /**
     * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are valid for this field: uptime_url, gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer k8s_service
     * 
     */
    @OutputExport(name="monitoredResource", type=MonitoredResourceResponse.class, parameters={})
    private Output<MonitoredResourceResponse> monitoredResource;

    /**
     * @return The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are valid for this field: uptime_url, gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer k8s_service
     * 
     */
    public Output<MonitoredResourceResponse> getMonitoredResource() {
        return this.monitoredResource;
    }
    /**
     * A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the server and included in the response.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the server and included in the response.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * How often, in seconds, the Uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 60s.
     * 
     */
    @OutputExport(name="period", type=String.class, parameters={})
    private Output<String> period;

    /**
     * @return How often, in seconds, the Uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 60s.
     * 
     */
    public Output<String> getPeriod() {
        return this.period;
    }
    /**
     * The group resource associated with the configuration.
     * 
     */
    @OutputExport(name="resourceGroup", type=ResourceGroupResponse.class, parameters={})
    private Output<ResourceGroupResponse> resourceGroup;

    /**
     * @return The group resource associated with the configuration.
     * 
     */
    public Output<ResourceGroupResponse> getResourceGroup() {
        return this.resourceGroup;
    }
    /**
     * The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
     * 
     */
    @OutputExport(name="selectedRegions", type=List.class, parameters={String.class})
    private Output<List<String>> selectedRegions;

    /**
     * @return The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
     * 
     */
    public Output<List<String>> getSelectedRegions() {
        return this.selectedRegions;
    }
    /**
     * Contains information needed to make a TCP check.
     * 
     */
    @OutputExport(name="tcpCheck", type=TcpCheckResponse.class, parameters={})
    private Output<TcpCheckResponse> tcpCheck;

    /**
     * @return Contains information needed to make a TCP check.
     * 
     */
    public Output<TcpCheckResponse> getTcpCheck() {
        return this.tcpCheck;
    }
    /**
     * The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Required.
     * 
     */
    @OutputExport(name="timeout", type=String.class, parameters={})
    private Output<String> timeout;

    /**
     * @return The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Required.
     * 
     */
    public Output<String> getTimeout() {
        return this.timeout;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UptimeCheckConfig(String name, @Nullable UptimeCheckConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:monitoring/v3:UptimeCheckConfig", name, args == null ? UptimeCheckConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private UptimeCheckConfig(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:monitoring/v3:UptimeCheckConfig", name, null, makeResourceOptions(options, id));
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
    public static UptimeCheckConfig get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UptimeCheckConfig(name, id, options);
    }
}
