// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.outputs;

import com.pulumi.aws.outputs.GetAmiBlockDeviceMapping;
import com.pulumi.aws.outputs.GetAmiFilter;
import com.pulumi.aws.outputs.GetAmiProductCode;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAmiResult {
    /**
     * @return The OS architecture of the AMI (ie: `i386` or `x86_64`).
     * 
     */
    private final String architecture;
    /**
     * @return The ARN of the AMI.
     * 
     */
    private final String arn;
    /**
     * @return Set of objects with block device mappings of the AMI.
     * 
     */
    private final List<GetAmiBlockDeviceMapping> blockDeviceMappings;
    /**
     * @return The date and time the image was created.
     * 
     */
    private final String creationDate;
    /**
     * @return The description of the AMI that was provided during image
     * creation.
     * 
     */
    private final String description;
    /**
     * @return Specifies whether enhanced networking with ENA is enabled.
     * 
     */
    private final Boolean enaSupport;
    private final @Nullable List<String> executableUsers;
    private final @Nullable List<GetAmiFilter> filters;
    /**
     * @return The hypervisor type of the image.
     * 
     */
    private final String hypervisor;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The ID of the AMI. Should be the same as the resource `id`.
     * 
     */
    private final String imageId;
    /**
     * @return The location of the AMI.
     * 
     */
    private final String imageLocation;
    /**
     * @return The AWS account alias (for example, `amazon`, `self`) or
     * the AWS account ID of the AMI owner.
     * 
     */
    private final String imageOwnerAlias;
    /**
     * @return The type of image.
     * 
     */
    private final String imageType;
    /**
     * @return The kernel associated with the image, if any. Only applicable
     * for machine images.
     * 
     */
    private final String kernelId;
    private final @Nullable Boolean mostRecent;
    /**
     * @return The name of the AMI that was provided during image creation.
     * 
     */
    private final String name;
    private final @Nullable String nameRegex;
    /**
     * @return The AWS account ID of the image owner.
     * 
     */
    private final String ownerId;
    private final List<String> owners;
    /**
     * @return The value is Windows for `Windows` AMIs; otherwise blank.
     * 
     */
    private final String platform;
    /**
     * @return The platform details associated with the billing code of the AMI.
     * 
     */
    private final String platformDetails;
    /**
     * @return Any product codes associated with the AMI.
     * * `product_codes.#.product_code_id` - The product code.
     * * `product_codes.#.product_code_type` - The type of product code.
     * 
     */
    private final List<GetAmiProductCode> productCodes;
    /**
     * @return `true` if the image has public launch permissions.
     * 
     */
    private final Boolean public_;
    /**
     * @return The RAM disk associated with the image, if any. Only applicable
     * for machine images.
     * 
     */
    private final String ramdiskId;
    /**
     * @return The device name of the root device.
     * 
     */
    private final String rootDeviceName;
    /**
     * @return The type of root device (ie: `ebs` or `instance-store`).
     * 
     */
    private final String rootDeviceType;
    /**
     * @return The snapshot id associated with the root device, if any
     * (only applies to `ebs` root devices).
     * 
     */
    private final String rootSnapshotId;
    /**
     * @return Specifies whether enhanced networking is enabled.
     * 
     */
    private final String sriovNetSupport;
    /**
     * @return The current state of the AMI. If the state is `available`, the image
     * is successfully registered and can be used to launch an instance.
     * 
     */
    private final String state;
    /**
     * @return Describes a state change. Fields are `UNSET` if not available.
     * * `state_reason.code` - The reason code for the state change.
     * * `state_reason.message` - The message for the state change.
     * 
     */
    private final Map<String,String> stateReason;
    /**
     * @return Any tags assigned to the image.
     * * `tags.#.key` - The key name of the tag.
     * * `tags.#.value` - The value of the tag.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The operation of the Amazon EC2 instance and the billing code that is associated with the AMI.
     * 
     */
    private final String usageOperation;
    /**
     * @return The type of virtualization of the AMI (ie: `hvm` or
     * `paravirtual`).
     * 
     */
    private final String virtualizationType;

    @CustomType.Constructor
    private GetAmiResult(
        @CustomType.Parameter("architecture") String architecture,
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("blockDeviceMappings") List<GetAmiBlockDeviceMapping> blockDeviceMappings,
        @CustomType.Parameter("creationDate") String creationDate,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("enaSupport") Boolean enaSupport,
        @CustomType.Parameter("executableUsers") @Nullable List<String> executableUsers,
        @CustomType.Parameter("filters") @Nullable List<GetAmiFilter> filters,
        @CustomType.Parameter("hypervisor") String hypervisor,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageId") String imageId,
        @CustomType.Parameter("imageLocation") String imageLocation,
        @CustomType.Parameter("imageOwnerAlias") String imageOwnerAlias,
        @CustomType.Parameter("imageType") String imageType,
        @CustomType.Parameter("kernelId") String kernelId,
        @CustomType.Parameter("mostRecent") @Nullable Boolean mostRecent,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("ownerId") String ownerId,
        @CustomType.Parameter("owners") List<String> owners,
        @CustomType.Parameter("platform") String platform,
        @CustomType.Parameter("platformDetails") String platformDetails,
        @CustomType.Parameter("productCodes") List<GetAmiProductCode> productCodes,
        @CustomType.Parameter("public") Boolean public_,
        @CustomType.Parameter("ramdiskId") String ramdiskId,
        @CustomType.Parameter("rootDeviceName") String rootDeviceName,
        @CustomType.Parameter("rootDeviceType") String rootDeviceType,
        @CustomType.Parameter("rootSnapshotId") String rootSnapshotId,
        @CustomType.Parameter("sriovNetSupport") String sriovNetSupport,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateReason") Map<String,String> stateReason,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("usageOperation") String usageOperation,
        @CustomType.Parameter("virtualizationType") String virtualizationType) {
        this.architecture = architecture;
        this.arn = arn;
        this.blockDeviceMappings = blockDeviceMappings;
        this.creationDate = creationDate;
        this.description = description;
        this.enaSupport = enaSupport;
        this.executableUsers = executableUsers;
        this.filters = filters;
        this.hypervisor = hypervisor;
        this.id = id;
        this.imageId = imageId;
        this.imageLocation = imageLocation;
        this.imageOwnerAlias = imageOwnerAlias;
        this.imageType = imageType;
        this.kernelId = kernelId;
        this.mostRecent = mostRecent;
        this.name = name;
        this.nameRegex = nameRegex;
        this.ownerId = ownerId;
        this.owners = owners;
        this.platform = platform;
        this.platformDetails = platformDetails;
        this.productCodes = productCodes;
        this.public_ = public_;
        this.ramdiskId = ramdiskId;
        this.rootDeviceName = rootDeviceName;
        this.rootDeviceType = rootDeviceType;
        this.rootSnapshotId = rootSnapshotId;
        this.sriovNetSupport = sriovNetSupport;
        this.state = state;
        this.stateReason = stateReason;
        this.tags = tags;
        this.usageOperation = usageOperation;
        this.virtualizationType = virtualizationType;
    }

    /**
     * @return The OS architecture of the AMI (ie: `i386` or `x86_64`).
     * 
     */
    public String architecture() {
        return this.architecture;
    }
    /**
     * @return The ARN of the AMI.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Set of objects with block device mappings of the AMI.
     * 
     */
    public List<GetAmiBlockDeviceMapping> blockDeviceMappings() {
        return this.blockDeviceMappings;
    }
    /**
     * @return The date and time the image was created.
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return The description of the AMI that was provided during image
     * creation.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Specifies whether enhanced networking with ENA is enabled.
     * 
     */
    public Boolean enaSupport() {
        return this.enaSupport;
    }
    public List<String> executableUsers() {
        return this.executableUsers == null ? List.of() : this.executableUsers;
    }
    public List<GetAmiFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The hypervisor type of the image.
     * 
     */
    public String hypervisor() {
        return this.hypervisor;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the AMI. Should be the same as the resource `id`.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return The location of the AMI.
     * 
     */
    public String imageLocation() {
        return this.imageLocation;
    }
    /**
     * @return The AWS account alias (for example, `amazon`, `self`) or
     * the AWS account ID of the AMI owner.
     * 
     */
    public String imageOwnerAlias() {
        return this.imageOwnerAlias;
    }
    /**
     * @return The type of image.
     * 
     */
    public String imageType() {
        return this.imageType;
    }
    /**
     * @return The kernel associated with the image, if any. Only applicable
     * for machine images.
     * 
     */
    public String kernelId() {
        return this.kernelId;
    }
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * @return The name of the AMI that was provided during image creation.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return The AWS account ID of the image owner.
     * 
     */
    public String ownerId() {
        return this.ownerId;
    }
    public List<String> owners() {
        return this.owners;
    }
    /**
     * @return The value is Windows for `Windows` AMIs; otherwise blank.
     * 
     */
    public String platform() {
        return this.platform;
    }
    /**
     * @return The platform details associated with the billing code of the AMI.
     * 
     */
    public String platformDetails() {
        return this.platformDetails;
    }
    /**
     * @return Any product codes associated with the AMI.
     * * `product_codes.#.product_code_id` - The product code.
     * * `product_codes.#.product_code_type` - The type of product code.
     * 
     */
    public List<GetAmiProductCode> productCodes() {
        return this.productCodes;
    }
    /**
     * @return `true` if the image has public launch permissions.
     * 
     */
    public Boolean public_() {
        return this.public_;
    }
    /**
     * @return The RAM disk associated with the image, if any. Only applicable
     * for machine images.
     * 
     */
    public String ramdiskId() {
        return this.ramdiskId;
    }
    /**
     * @return The device name of the root device.
     * 
     */
    public String rootDeviceName() {
        return this.rootDeviceName;
    }
    /**
     * @return The type of root device (ie: `ebs` or `instance-store`).
     * 
     */
    public String rootDeviceType() {
        return this.rootDeviceType;
    }
    /**
     * @return The snapshot id associated with the root device, if any
     * (only applies to `ebs` root devices).
     * 
     */
    public String rootSnapshotId() {
        return this.rootSnapshotId;
    }
    /**
     * @return Specifies whether enhanced networking is enabled.
     * 
     */
    public String sriovNetSupport() {
        return this.sriovNetSupport;
    }
    /**
     * @return The current state of the AMI. If the state is `available`, the image
     * is successfully registered and can be used to launch an instance.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Describes a state change. Fields are `UNSET` if not available.
     * * `state_reason.code` - The reason code for the state change.
     * * `state_reason.message` - The message for the state change.
     * 
     */
    public Map<String,String> stateReason() {
        return this.stateReason;
    }
    /**
     * @return Any tags assigned to the image.
     * * `tags.#.key` - The key name of the tag.
     * * `tags.#.value` - The value of the tag.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The operation of the Amazon EC2 instance and the billing code that is associated with the AMI.
     * 
     */
    public String usageOperation() {
        return this.usageOperation;
    }
    /**
     * @return The type of virtualization of the AMI (ie: `hvm` or
     * `paravirtual`).
     * 
     */
    public String virtualizationType() {
        return this.virtualizationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAmiResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String architecture;
        private String arn;
        private List<GetAmiBlockDeviceMapping> blockDeviceMappings;
        private String creationDate;
        private String description;
        private Boolean enaSupport;
        private @Nullable List<String> executableUsers;
        private @Nullable List<GetAmiFilter> filters;
        private String hypervisor;
        private String id;
        private String imageId;
        private String imageLocation;
        private String imageOwnerAlias;
        private String imageType;
        private String kernelId;
        private @Nullable Boolean mostRecent;
        private String name;
        private @Nullable String nameRegex;
        private String ownerId;
        private List<String> owners;
        private String platform;
        private String platformDetails;
        private List<GetAmiProductCode> productCodes;
        private Boolean public_;
        private String ramdiskId;
        private String rootDeviceName;
        private String rootDeviceType;
        private String rootSnapshotId;
        private String sriovNetSupport;
        private String state;
        private Map<String,String> stateReason;
        private Map<String,String> tags;
        private String usageOperation;
        private String virtualizationType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAmiResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.arn = defaults.arn;
    	      this.blockDeviceMappings = defaults.blockDeviceMappings;
    	      this.creationDate = defaults.creationDate;
    	      this.description = defaults.description;
    	      this.enaSupport = defaults.enaSupport;
    	      this.executableUsers = defaults.executableUsers;
    	      this.filters = defaults.filters;
    	      this.hypervisor = defaults.hypervisor;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.imageLocation = defaults.imageLocation;
    	      this.imageOwnerAlias = defaults.imageOwnerAlias;
    	      this.imageType = defaults.imageType;
    	      this.kernelId = defaults.kernelId;
    	      this.mostRecent = defaults.mostRecent;
    	      this.name = defaults.name;
    	      this.nameRegex = defaults.nameRegex;
    	      this.ownerId = defaults.ownerId;
    	      this.owners = defaults.owners;
    	      this.platform = defaults.platform;
    	      this.platformDetails = defaults.platformDetails;
    	      this.productCodes = defaults.productCodes;
    	      this.public_ = defaults.public_;
    	      this.ramdiskId = defaults.ramdiskId;
    	      this.rootDeviceName = defaults.rootDeviceName;
    	      this.rootDeviceType = defaults.rootDeviceType;
    	      this.rootSnapshotId = defaults.rootSnapshotId;
    	      this.sriovNetSupport = defaults.sriovNetSupport;
    	      this.state = defaults.state;
    	      this.stateReason = defaults.stateReason;
    	      this.tags = defaults.tags;
    	      this.usageOperation = defaults.usageOperation;
    	      this.virtualizationType = defaults.virtualizationType;
        }

        public Builder architecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder blockDeviceMappings(List<GetAmiBlockDeviceMapping> blockDeviceMappings) {
            this.blockDeviceMappings = Objects.requireNonNull(blockDeviceMappings);
            return this;
        }
        public Builder blockDeviceMappings(GetAmiBlockDeviceMapping... blockDeviceMappings) {
            return blockDeviceMappings(List.of(blockDeviceMappings));
        }
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder enaSupport(Boolean enaSupport) {
            this.enaSupport = Objects.requireNonNull(enaSupport);
            return this;
        }
        public Builder executableUsers(@Nullable List<String> executableUsers) {
            this.executableUsers = executableUsers;
            return this;
        }
        public Builder executableUsers(String... executableUsers) {
            return executableUsers(List.of(executableUsers));
        }
        public Builder filters(@Nullable List<GetAmiFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetAmiFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder hypervisor(String hypervisor) {
            this.hypervisor = Objects.requireNonNull(hypervisor);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public Builder imageLocation(String imageLocation) {
            this.imageLocation = Objects.requireNonNull(imageLocation);
            return this;
        }
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = Objects.requireNonNull(imageOwnerAlias);
            return this;
        }
        public Builder imageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }
        public Builder kernelId(String kernelId) {
            this.kernelId = Objects.requireNonNull(kernelId);
            return this;
        }
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }
        public Builder owners(List<String> owners) {
            this.owners = Objects.requireNonNull(owners);
            return this;
        }
        public Builder owners(String... owners) {
            return owners(List.of(owners));
        }
        public Builder platform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }
        public Builder platformDetails(String platformDetails) {
            this.platformDetails = Objects.requireNonNull(platformDetails);
            return this;
        }
        public Builder productCodes(List<GetAmiProductCode> productCodes) {
            this.productCodes = Objects.requireNonNull(productCodes);
            return this;
        }
        public Builder productCodes(GetAmiProductCode... productCodes) {
            return productCodes(List.of(productCodes));
        }
        public Builder public_(Boolean public_) {
            this.public_ = Objects.requireNonNull(public_);
            return this;
        }
        public Builder ramdiskId(String ramdiskId) {
            this.ramdiskId = Objects.requireNonNull(ramdiskId);
            return this;
        }
        public Builder rootDeviceName(String rootDeviceName) {
            this.rootDeviceName = Objects.requireNonNull(rootDeviceName);
            return this;
        }
        public Builder rootDeviceType(String rootDeviceType) {
            this.rootDeviceType = Objects.requireNonNull(rootDeviceType);
            return this;
        }
        public Builder rootSnapshotId(String rootSnapshotId) {
            this.rootSnapshotId = Objects.requireNonNull(rootSnapshotId);
            return this;
        }
        public Builder sriovNetSupport(String sriovNetSupport) {
            this.sriovNetSupport = Objects.requireNonNull(sriovNetSupport);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateReason(Map<String,String> stateReason) {
            this.stateReason = Objects.requireNonNull(stateReason);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder usageOperation(String usageOperation) {
            this.usageOperation = Objects.requireNonNull(usageOperation);
            return this;
        }
        public Builder virtualizationType(String virtualizationType) {
            this.virtualizationType = Objects.requireNonNull(virtualizationType);
            return this;
        }        public GetAmiResult build() {
            return new GetAmiResult(architecture, arn, blockDeviceMappings, creationDate, description, enaSupport, executableUsers, filters, hypervisor, id, imageId, imageLocation, imageOwnerAlias, imageType, kernelId, mostRecent, name, nameRegex, ownerId, owners, platform, platformDetails, productCodes, public_, ramdiskId, rootDeviceName, rootDeviceType, rootSnapshotId, sriovNetSupport, state, stateReason, tags, usageOperation, virtualizationType);
        }
    }
}
