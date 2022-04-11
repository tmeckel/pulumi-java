// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.RegionCommitmentArgs;
import io.pulumi.googlenative.compute_v1.outputs.LicenseResourceCommitmentResponse;
import io.pulumi.googlenative.compute_v1.outputs.ReservationResponse;
import io.pulumi.googlenative.compute_v1.outputs.ResourceCommitmentResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a commitment in the specified project using the data included in the request.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:compute/v1:RegionCommitment")
public class RegionCommitment extends io.pulumi.resources.CustomResource {
    /**
     * Specifies whether to enable automatic renewal for the commitment. The default value is false if not specified. The field can be updated until the day of the commitment expiration at 12:00am PST. If the field is set to true, the commitment will be automatically renewed for either one or three years according to the terms of the existing commitment.
     * 
     */
    @Export(name="autoRenew", type=Boolean.class, parameters={})
    private Output<Boolean> autoRenew;

    /**
     * @return Specifies whether to enable automatic renewal for the commitment. The default value is false if not specified. The field can be updated until the day of the commitment expiration at 12:00am PST. If the field is set to true, the commitment will be automatically renewed for either one or three years according to the terms of the existing commitment.
     * 
     */
    public Output<Boolean> getAutoRenew() {
        return this.autoRenew;
    }
    /**
     * The category of the commitment. Category MACHINE specifies commitments composed of machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments composed of software licenses, listed in licenseResources. Note that only MACHINE commitments should have a Type specified.
     * 
     */
    @Export(name="category", type=String.class, parameters={})
    private Output<String> category;

    /**
     * @return The category of the commitment. Category MACHINE specifies commitments composed of machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments composed of software licenses, listed in licenseResources. Note that only MACHINE commitments should have a Type specified.
     * 
     */
    public Output<String> getCategory() {
        return this.category;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Commitment end time in RFC3339 text format.
     * 
     */
    @Export(name="endTimestamp", type=String.class, parameters={})
    private Output<String> endTimestamp;

    /**
     * @return Commitment end time in RFC3339 text format.
     * 
     */
    public Output<String> getEndTimestamp() {
        return this.endTimestamp;
    }
    /**
     * Type of the resource. Always compute#commitment for commitments.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#commitment for commitments.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The license specification required as part of a license commitment.
     * 
     */
    @Export(name="licenseResource", type=LicenseResourceCommitmentResponse.class, parameters={})
    private Output<LicenseResourceCommitmentResponse> licenseResource;

    /**
     * @return The license specification required as part of a license commitment.
     * 
     */
    public Output<LicenseResourceCommitmentResponse> getLicenseResource() {
        return this.licenseResource;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
     * 
     */
    @Export(name="plan", type=String.class, parameters={})
    private Output<String> plan;

    /**
     * @return The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
     * 
     */
    public Output<String> getPlan() {
        return this.plan;
    }
    /**
     * URL of the region where this commitment may be used.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where this commitment may be used.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * List of reservations in this commitment.
     * 
     */
    @Export(name="reservations", type=List.class, parameters={ReservationResponse.class})
    private Output<List<ReservationResponse>> reservations;

    /**
     * @return List of reservations in this commitment.
     * 
     */
    public Output<List<ReservationResponse>> getReservations() {
        return this.reservations;
    }
    /**
     * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
     * 
     */
    @Export(name="resources", type=List.class, parameters={ResourceCommitmentResponse.class})
    private Output<List<ResourceCommitmentResponse>> resources;

    /**
     * @return A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
     * 
     */
    public Output<List<ResourceCommitmentResponse>> getResources() {
        return this.resources;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Commitment start time in RFC3339 text format.
     * 
     */
    @Export(name="startTimestamp", type=String.class, parameters={})
    private Output<String> startTimestamp;

    /**
     * @return Commitment start time in RFC3339 text format.
     * 
     */
    public Output<String> getStartTimestamp() {
        return this.startTimestamp;
    }
    /**
     * Status of the commitment with regards to eventual expiration (each commitment has an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the commitment with regards to eventual expiration (each commitment has an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * An optional, human-readable explanation of the status.
     * 
     */
    @Export(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return An optional, human-readable explanation of the status.
     * 
     */
    public Output<String> getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * The type of commitment, which affects the discount rate and the eligible resources. Type MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines. Type ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to accelerator optimized machines.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of commitment, which affects the discount rate and the eligible resources. Type MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines. Type ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to accelerator optimized machines.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionCommitment(String name) {
        this(name, RegionCommitmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionCommitment(String name, RegionCommitmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionCommitment(String name, RegionCommitmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:RegionCommitment", name, args == null ? RegionCommitmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegionCommitment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:RegionCommitment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static RegionCommitment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionCommitment(name, id, options);
    }
}
