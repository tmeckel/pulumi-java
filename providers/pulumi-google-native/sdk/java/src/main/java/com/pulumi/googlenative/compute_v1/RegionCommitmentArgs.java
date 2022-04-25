// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.enums.RegionCommitmentCategory;
import com.pulumi.googlenative.compute_v1.enums.RegionCommitmentPlan;
import com.pulumi.googlenative.compute_v1.enums.RegionCommitmentType;
import com.pulumi.googlenative.compute_v1.inputs.LicenseResourceCommitmentArgs;
import com.pulumi.googlenative.compute_v1.inputs.ReservationArgs;
import com.pulumi.googlenative.compute_v1.inputs.ResourceCommitmentArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionCommitmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionCommitmentArgs Empty = new RegionCommitmentArgs();

    /**
     * Specifies whether to enable automatic renewal for the commitment. The default value is false if not specified. The field can be updated until the day of the commitment expiration at 12:00am PST. If the field is set to true, the commitment will be automatically renewed for either one or three years according to the terms of the existing commitment.
     * 
     */
    @Import(name="autoRenew")
    private @Nullable Output<Boolean> autoRenew;

    /**
     * @return Specifies whether to enable automatic renewal for the commitment. The default value is false if not specified. The field can be updated until the day of the commitment expiration at 12:00am PST. If the field is set to true, the commitment will be automatically renewed for either one or three years according to the terms of the existing commitment.
     * 
     */
    public Optional<Output<Boolean>> autoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }

    /**
     * The category of the commitment. Category MACHINE specifies commitments composed of machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments composed of software licenses, listed in licenseResources. Note that only MACHINE commitments should have a Type specified.
     * 
     */
    @Import(name="category")
    private @Nullable Output<RegionCommitmentCategory> category;

    /**
     * @return The category of the commitment. Category MACHINE specifies commitments composed of machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments composed of software licenses, listed in licenseResources. Note that only MACHINE commitments should have a Type specified.
     * 
     */
    public Optional<Output<RegionCommitmentCategory>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The license specification required as part of a license commitment.
     * 
     */
    @Import(name="licenseResource")
    private @Nullable Output<LicenseResourceCommitmentArgs> licenseResource;

    /**
     * @return The license specification required as part of a license commitment.
     * 
     */
    public Optional<Output<LicenseResourceCommitmentArgs>> licenseResource() {
        return Optional.ofNullable(this.licenseResource);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
     * 
     */
    @Import(name="plan")
    private @Nullable Output<RegionCommitmentPlan> plan;

    /**
     * @return The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
     * 
     */
    public Optional<Output<RegionCommitmentPlan>> plan() {
        return Optional.ofNullable(this.plan);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * List of reservations in this commitment.
     * 
     */
    @Import(name="reservations")
    private @Nullable Output<List<ReservationArgs>> reservations;

    /**
     * @return List of reservations in this commitment.
     * 
     */
    public Optional<Output<List<ReservationArgs>>> reservations() {
        return Optional.ofNullable(this.reservations);
    }

    /**
     * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<ResourceCommitmentArgs>> resources;

    /**
     * @return A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
     * 
     */
    public Optional<Output<List<ResourceCommitmentArgs>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    /**
     * The type of commitment, which affects the discount rate and the eligible resources. Type MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines. Type ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to accelerator optimized machines.
     * 
     */
    @Import(name="type")
    private @Nullable Output<RegionCommitmentType> type;

    /**
     * @return The type of commitment, which affects the discount rate and the eligible resources. Type MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines. Type ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to accelerator optimized machines.
     * 
     */
    public Optional<Output<RegionCommitmentType>> type() {
        return Optional.ofNullable(this.type);
    }

    private RegionCommitmentArgs() {}

    private RegionCommitmentArgs(RegionCommitmentArgs $) {
        this.autoRenew = $.autoRenew;
        this.category = $.category;
        this.description = $.description;
        this.licenseResource = $.licenseResource;
        this.name = $.name;
        this.plan = $.plan;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
        this.reservations = $.reservations;
        this.resources = $.resources;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionCommitmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionCommitmentArgs $;

        public Builder() {
            $ = new RegionCommitmentArgs();
        }

        public Builder(RegionCommitmentArgs defaults) {
            $ = new RegionCommitmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoRenew Specifies whether to enable automatic renewal for the commitment. The default value is false if not specified. The field can be updated until the day of the commitment expiration at 12:00am PST. If the field is set to true, the commitment will be automatically renewed for either one or three years according to the terms of the existing commitment.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(@Nullable Output<Boolean> autoRenew) {
            $.autoRenew = autoRenew;
            return this;
        }

        /**
         * @param autoRenew Specifies whether to enable automatic renewal for the commitment. The default value is false if not specified. The field can be updated until the day of the commitment expiration at 12:00am PST. If the field is set to true, the commitment will be automatically renewed for either one or three years according to the terms of the existing commitment.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(Boolean autoRenew) {
            return autoRenew(Output.of(autoRenew));
        }

        /**
         * @param category The category of the commitment. Category MACHINE specifies commitments composed of machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments composed of software licenses, listed in licenseResources. Note that only MACHINE commitments should have a Type specified.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<RegionCommitmentCategory> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category The category of the commitment. Category MACHINE specifies commitments composed of machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments composed of software licenses, listed in licenseResources. Note that only MACHINE commitments should have a Type specified.
         * 
         * @return builder
         * 
         */
        public Builder category(RegionCommitmentCategory category) {
            return category(Output.of(category));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param licenseResource The license specification required as part of a license commitment.
         * 
         * @return builder
         * 
         */
        public Builder licenseResource(@Nullable Output<LicenseResourceCommitmentArgs> licenseResource) {
            $.licenseResource = licenseResource;
            return this;
        }

        /**
         * @param licenseResource The license specification required as part of a license commitment.
         * 
         * @return builder
         * 
         */
        public Builder licenseResource(LicenseResourceCommitmentArgs licenseResource) {
            return licenseResource(Output.of(licenseResource));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param plan The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
         * 
         * @return builder
         * 
         */
        public Builder plan(@Nullable Output<RegionCommitmentPlan> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
         * 
         * @return builder
         * 
         */
        public Builder plan(RegionCommitmentPlan plan) {
            return plan(Output.of(plan));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param reservations List of reservations in this commitment.
         * 
         * @return builder
         * 
         */
        public Builder reservations(@Nullable Output<List<ReservationArgs>> reservations) {
            $.reservations = reservations;
            return this;
        }

        /**
         * @param reservations List of reservations in this commitment.
         * 
         * @return builder
         * 
         */
        public Builder reservations(List<ReservationArgs> reservations) {
            return reservations(Output.of(reservations));
        }

        /**
         * @param reservations List of reservations in this commitment.
         * 
         * @return builder
         * 
         */
        public Builder reservations(ReservationArgs... reservations) {
            return reservations(List.of(reservations));
        }

        /**
         * @param resources A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<ResourceCommitmentArgs>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
         * 
         * @return builder
         * 
         */
        public Builder resources(List<ResourceCommitmentArgs> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
         * 
         * @return builder
         * 
         */
        public Builder resources(ResourceCommitmentArgs... resources) {
            return resources(List.of(resources));
        }

        /**
         * @param type The type of commitment, which affects the discount rate and the eligible resources. Type MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines. Type ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to accelerator optimized machines.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<RegionCommitmentType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of commitment, which affects the discount rate and the eligible resources. Type MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines. Type ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to accelerator optimized machines.
         * 
         * @return builder
         * 
         */
        public Builder type(RegionCommitmentType type) {
            return type(Output.of(type));
        }

        public RegionCommitmentArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
