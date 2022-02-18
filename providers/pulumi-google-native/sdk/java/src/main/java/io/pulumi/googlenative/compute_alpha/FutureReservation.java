// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.FutureReservationArgs;
import io.pulumi.googlenative.compute_alpha.outputs.FutureReservationSpecificSKUPropertiesResponse;
import io.pulumi.googlenative.compute_alpha.outputs.FutureReservationStatusResponse;
import io.pulumi.googlenative.compute_alpha.outputs.FutureReservationTimeWindowResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ShareSettingsResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new Future Reservation.
 * 
 */
@ResourceType(type="google-native:compute/alpha:FutureReservation")
public class FutureReservation extends io.pulumi.resources.CustomResource {
    /**
     * The creation timestamp for this future reservation in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return The creation timestamp for this future reservation in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the future reservation.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the future reservation.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Name prefix for the reservations to be created at the time of delivery. The name prefix must comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created reservations name format will be -date-####.
     * 
     */
    @OutputExport(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Name prefix for the reservations to be created at the time of delivery. The name prefix must comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created reservations name format will be -date-####.
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined fully-qualified URL for this resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @OutputExport(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * List of Projects/Folders to share with.
     * 
     */
    @OutputExport(name="shareSettings", type=ShareSettingsResponse.class, parameters={})
    private Output<ShareSettingsResponse> shareSettings;

    /**
     * @return List of Projects/Folders to share with.
     * 
     */
    public Output<ShareSettingsResponse> getShareSettings() {
        return this.shareSettings;
    }
    /**
     * Future Reservation configuration to indicate instance properties and total count.
     * 
     */
    @OutputExport(name="specificSkuProperties", type=FutureReservationSpecificSKUPropertiesResponse.class, parameters={})
    private Output<FutureReservationSpecificSKUPropertiesResponse> specificSkuProperties;

    /**
     * @return Future Reservation configuration to indicate instance properties and total count.
     * 
     */
    public Output<FutureReservationSpecificSKUPropertiesResponse> getSpecificSkuProperties() {
        return this.specificSkuProperties;
    }
    /**
     * [Output only] Status of the Future Reservation
     * 
     */
    @OutputExport(name="status", type=FutureReservationStatusResponse.class, parameters={})
    private Output<FutureReservationStatusResponse> status;

    /**
     * @return [Output only] Status of the Future Reservation
     * 
     */
    public Output<FutureReservationStatusResponse> getStatus() {
        return this.status;
    }
    /**
     * Time window for this Future Reservation.
     * 
     */
    @OutputExport(name="timeWindow", type=FutureReservationTimeWindowResponse.class, parameters={})
    private Output<FutureReservationTimeWindowResponse> timeWindow;

    /**
     * @return Time window for this Future Reservation.
     * 
     */
    public Output<FutureReservationTimeWindowResponse> getTimeWindow() {
        return this.timeWindow;
    }
    /**
     * URL of the Zone where this future reservation resides.
     * 
     */
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return URL of the Zone where this future reservation resides.
     * 
     */
    public Output<String> getZone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FutureReservation(String name, @Nullable FutureReservationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:FutureReservation", name, args == null ? FutureReservationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FutureReservation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:FutureReservation", name, null, makeResourceOptions(options, id));
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
    public static FutureReservation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FutureReservation(name, id, options);
    }
}
