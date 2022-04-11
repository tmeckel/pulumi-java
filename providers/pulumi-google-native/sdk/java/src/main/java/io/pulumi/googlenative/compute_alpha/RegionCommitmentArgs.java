// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.RegionCommitmentCategory;
import io.pulumi.googlenative.compute_alpha.enums.RegionCommitmentPlan;
import io.pulumi.googlenative.compute_alpha.enums.RegionCommitmentType;
import io.pulumi.googlenative.compute_alpha.inputs.LicenseResourceCommitmentArgs;
import io.pulumi.googlenative.compute_alpha.inputs.ReservationArgs;
import io.pulumi.googlenative.compute_alpha.inputs.ResourceCommitmentArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionCommitmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionCommitmentArgs Empty = new RegionCommitmentArgs();

    /**
     * Specifies whether to enable automatic renewal for the commitment. The default value is false if not specified. The field can be updated until the day of the commitment expiration at 12:00am PST. If the field is set to true, the commitment will be automatically renewed for either one or three years according to the terms of the existing commitment.
     * 
     */
    @Import(name="autoRenew")
      private final @Nullable Output<Boolean> autoRenew;

    public Output<Boolean> getAutoRenew() {
        return this.autoRenew == null ? Codegen.empty() : this.autoRenew;
    }

    /**
     * The category of the commitment. Category MACHINE specifies commitments composed of machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments composed of software licenses, listed in licenseResources. Note that only MACHINE commitments should have a Type specified.
     * 
     */
    @Import(name="category")
      private final @Nullable Output<RegionCommitmentCategory> category;

    public Output<RegionCommitmentCategory> getCategory() {
        return this.category == null ? Codegen.empty() : this.category;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The license specification required as part of a license commitment.
     * 
     */
    @Import(name="licenseResource")
      private final @Nullable Output<LicenseResourceCommitmentArgs> licenseResource;

    public Output<LicenseResourceCommitmentArgs> getLicenseResource() {
        return this.licenseResource == null ? Codegen.empty() : this.licenseResource;
    }

    /**
     * List of source commitments to be merged into a new commitment.
     * 
     */
    @Import(name="mergeSourceCommitments")
      private final @Nullable Output<List<String>> mergeSourceCommitments;

    public Output<List<String>> getMergeSourceCommitments() {
        return this.mergeSourceCommitments == null ? Codegen.empty() : this.mergeSourceCommitments;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
     * 
     */
    @Import(name="plan")
      private final @Nullable Output<RegionCommitmentPlan> plan;

    public Output<RegionCommitmentPlan> getPlan() {
        return this.plan == null ? Codegen.empty() : this.plan;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * List of reservations in this commitment.
     * 
     */
    @Import(name="reservations")
      private final @Nullable Output<List<ReservationArgs>> reservations;

    public Output<List<ReservationArgs>> getReservations() {
        return this.reservations == null ? Codegen.empty() : this.reservations;
    }

    /**
     * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<List<ResourceCommitmentArgs>> resources;

    public Output<List<ResourceCommitmentArgs>> getResources() {
        return this.resources == null ? Codegen.empty() : this.resources;
    }

    /**
     * Source commitment to be splitted into a new commitment.
     * 
     */
    @Import(name="splitSourceCommitment")
      private final @Nullable Output<String> splitSourceCommitment;

    public Output<String> getSplitSourceCommitment() {
        return this.splitSourceCommitment == null ? Codegen.empty() : this.splitSourceCommitment;
    }

    /**
     * The type of commitment, which affects the discount rate and the eligible resources. Type MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines. Type ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to accelerator optimized machines.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<RegionCommitmentType> type;

    public Output<RegionCommitmentType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public RegionCommitmentArgs(
        @Nullable Output<Boolean> autoRenew,
        @Nullable Output<RegionCommitmentCategory> category,
        @Nullable Output<String> description,
        @Nullable Output<LicenseResourceCommitmentArgs> licenseResource,
        @Nullable Output<List<String>> mergeSourceCommitments,
        @Nullable Output<String> name,
        @Nullable Output<RegionCommitmentPlan> plan,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<List<ReservationArgs>> reservations,
        @Nullable Output<List<ResourceCommitmentArgs>> resources,
        @Nullable Output<String> splitSourceCommitment,
        @Nullable Output<RegionCommitmentType> type) {
        this.autoRenew = autoRenew;
        this.category = category;
        this.description = description;
        this.licenseResource = licenseResource;
        this.mergeSourceCommitments = mergeSourceCommitments;
        this.name = name;
        this.plan = plan;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.reservations = reservations;
        this.resources = resources;
        this.splitSourceCommitment = splitSourceCommitment;
        this.type = type;
    }

    private RegionCommitmentArgs() {
        this.autoRenew = Codegen.empty();
        this.category = Codegen.empty();
        this.description = Codegen.empty();
        this.licenseResource = Codegen.empty();
        this.mergeSourceCommitments = Codegen.empty();
        this.name = Codegen.empty();
        this.plan = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.requestId = Codegen.empty();
        this.reservations = Codegen.empty();
        this.resources = Codegen.empty();
        this.splitSourceCommitment = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionCommitmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoRenew;
        private @Nullable Output<RegionCommitmentCategory> category;
        private @Nullable Output<String> description;
        private @Nullable Output<LicenseResourceCommitmentArgs> licenseResource;
        private @Nullable Output<List<String>> mergeSourceCommitments;
        private @Nullable Output<String> name;
        private @Nullable Output<RegionCommitmentPlan> plan;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<List<ReservationArgs>> reservations;
        private @Nullable Output<List<ResourceCommitmentArgs>> resources;
        private @Nullable Output<String> splitSourceCommitment;
        private @Nullable Output<RegionCommitmentType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionCommitmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRenew = defaults.autoRenew;
    	      this.category = defaults.category;
    	      this.description = defaults.description;
    	      this.licenseResource = defaults.licenseResource;
    	      this.mergeSourceCommitments = defaults.mergeSourceCommitments;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.reservations = defaults.reservations;
    	      this.resources = defaults.resources;
    	      this.splitSourceCommitment = defaults.splitSourceCommitment;
    	      this.type = defaults.type;
        }

        public Builder autoRenew(@Nullable Output<Boolean> autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Builder autoRenew(@Nullable Boolean autoRenew) {
            this.autoRenew = Codegen.ofNullable(autoRenew);
            return this;
        }
        public Builder category(@Nullable Output<RegionCommitmentCategory> category) {
            this.category = category;
            return this;
        }
        public Builder category(@Nullable RegionCommitmentCategory category) {
            this.category = Codegen.ofNullable(category);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder licenseResource(@Nullable Output<LicenseResourceCommitmentArgs> licenseResource) {
            this.licenseResource = licenseResource;
            return this;
        }
        public Builder licenseResource(@Nullable LicenseResourceCommitmentArgs licenseResource) {
            this.licenseResource = Codegen.ofNullable(licenseResource);
            return this;
        }
        public Builder mergeSourceCommitments(@Nullable Output<List<String>> mergeSourceCommitments) {
            this.mergeSourceCommitments = mergeSourceCommitments;
            return this;
        }
        public Builder mergeSourceCommitments(@Nullable List<String> mergeSourceCommitments) {
            this.mergeSourceCommitments = Codegen.ofNullable(mergeSourceCommitments);
            return this;
        }
        public Builder mergeSourceCommitments(String... mergeSourceCommitments) {
            return mergeSourceCommitments(List.of(mergeSourceCommitments));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder plan(@Nullable Output<RegionCommitmentPlan> plan) {
            this.plan = plan;
            return this;
        }
        public Builder plan(@Nullable RegionCommitmentPlan plan) {
            this.plan = Codegen.ofNullable(plan);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder reservations(@Nullable Output<List<ReservationArgs>> reservations) {
            this.reservations = reservations;
            return this;
        }
        public Builder reservations(@Nullable List<ReservationArgs> reservations) {
            this.reservations = Codegen.ofNullable(reservations);
            return this;
        }
        public Builder reservations(ReservationArgs... reservations) {
            return reservations(List.of(reservations));
        }
        public Builder resources(@Nullable Output<List<ResourceCommitmentArgs>> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable List<ResourceCommitmentArgs> resources) {
            this.resources = Codegen.ofNullable(resources);
            return this;
        }
        public Builder resources(ResourceCommitmentArgs... resources) {
            return resources(List.of(resources));
        }
        public Builder splitSourceCommitment(@Nullable Output<String> splitSourceCommitment) {
            this.splitSourceCommitment = splitSourceCommitment;
            return this;
        }
        public Builder splitSourceCommitment(@Nullable String splitSourceCommitment) {
            this.splitSourceCommitment = Codegen.ofNullable(splitSourceCommitment);
            return this;
        }
        public Builder type(@Nullable Output<RegionCommitmentType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable RegionCommitmentType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public RegionCommitmentArgs build() {
            return new RegionCommitmentArgs(autoRenew, category, description, licenseResource, mergeSourceCommitments, name, plan, project, region, requestId, reservations, resources, splitSourceCommitment, type);
        }
    }
}
