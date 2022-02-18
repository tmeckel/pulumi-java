// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.toolresults_v1beta3.HistoryArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a History. The returned History will have the id set. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing project does not exist
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:toolresults/v1beta3:History")
public class History extends io.pulumi.resources.CustomResource {
    /**
     * A short human-readable (plain text) name to display in the UI. Maximum of 100 characters. - In response: present if set during create. - In create request: optional
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A short human-readable (plain text) name to display in the UI. Maximum of 100 characters. - In response: present if set during create. - In create request: optional
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * A unique identifier within a project for this History. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create request: never set
     * 
     */
    @OutputExport(name="historyId", type=String.class, parameters={})
    private Output<String> historyId;

    /**
     * @return A unique identifier within a project for this History. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create request: never set
     * 
     */
    public Output<String> getHistoryId() {
        return this.historyId;
    }
    /**
     * A name to uniquely identify a history within a project. Maximum of 200 characters. - In response always set - In create request: always set
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name to uniquely identify a history within a project. Maximum of 200 characters. - In response always set - In create request: always set
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The platform of the test history. - In response: always set. Returns the platform of the last execution if unknown.
     * 
     */
    @OutputExport(name="testPlatform", type=String.class, parameters={})
    private Output<String> testPlatform;

    /**
     * @return The platform of the test history. - In response: always set. Returns the platform of the last execution if unknown.
     * 
     */
    public Output<String> getTestPlatform() {
        return this.testPlatform;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public History(String name, @Nullable HistoryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:toolresults/v1beta3:History", name, args == null ? HistoryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private History(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:toolresults/v1beta3:History", name, null, makeResourceOptions(options, id));
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
    public static History get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new History(name, id, options);
    }
}
