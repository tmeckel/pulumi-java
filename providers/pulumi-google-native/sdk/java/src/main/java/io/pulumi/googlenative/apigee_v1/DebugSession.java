// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.DebugSessionArgs;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a debug session for a deployed API Proxy revision.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:apigee/v1:DebugSession")
public class DebugSession extends io.pulumi.resources.CustomResource {
    /**
     * Optional. The number of request to be traced. Min = 1, Max = 15, Default = 10.
     * 
     */
    @OutputExport(name="count", type=Integer.class, parameters={})
    private Output<Integer> count;

    /**
     * @return Optional. The number of request to be traced. Min = 1, Max = 15, Default = 10.
     * 
     */
    public Output<Integer> getCount() {
        return this.count;
    }
    /**
     * Optional. A conditional statement which is evaluated against the request message to determine if it should be traced. Syntax matches that of on API Proxy bundle flow Condition.
     * 
     */
    @OutputExport(name="filter", type=String.class, parameters={})
    private Output<String> filter;

    /**
     * @return Optional. A conditional statement which is evaluated against the request message to determine if it should be traced. Syntax matches that of on API Proxy bundle flow Condition.
     * 
     */
    public Output<String> getFilter() {
        return this.filter;
    }
    /**
     * A unique ID for this DebugSession.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique ID for this DebugSession.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. The time in seconds after which this DebugSession should end. This value will override the value in query param, if both are provided.
     * 
     */
    @OutputExport(name="timeout", type=String.class, parameters={})
    private Output<String> timeout;

    /**
     * @return Optional. The time in seconds after which this DebugSession should end. This value will override the value in query param, if both are provided.
     * 
     */
    public Output<String> getTimeout() {
        return this.timeout;
    }
    /**
     * Optional. The maximum number of bytes captured from the response payload. Min = 0, Max = 5120, Default = 5120.
     * 
     */
    @OutputExport(name="tracesize", type=Integer.class, parameters={})
    private Output<Integer> tracesize;

    /**
     * @return Optional. The maximum number of bytes captured from the response payload. Min = 0, Max = 5120, Default = 5120.
     * 
     */
    public Output<Integer> getTracesize() {
        return this.tracesize;
    }
    /**
     * Optional. The length of time, in seconds, that this debug session is valid, starting from when it's received in the control plane. Min = 1, Max = 15, Default = 10.
     * 
     */
    @OutputExport(name="validity", type=Integer.class, parameters={})
    private Output<Integer> validity;

    /**
     * @return Optional. The length of time, in seconds, that this debug session is valid, starting from when it's received in the control plane. Min = 1, Max = 15, Default = 10.
     * 
     */
    public Output<Integer> getValidity() {
        return this.validity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DebugSession(String name, DebugSessionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:DebugSession", name, args == null ? DebugSessionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DebugSession(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:DebugSession", name, null, makeResourceOptions(options, id));
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
    public static DebugSession get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DebugSession(name, id, options);
    }
}
