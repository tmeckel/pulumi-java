// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.enums.HyperVGeneration;
import io.pulumi.azurenative.compute.enums.OperatingSystemStateTypes;
import io.pulumi.azurenative.compute.enums.OperatingSystemTypes;
import io.pulumi.azurenative.compute.inputs.DisallowedArgs;
import io.pulumi.azurenative.compute.inputs.GalleryImageFeatureArgs;
import io.pulumi.azurenative.compute.inputs.GalleryImageIdentifierArgs;
import io.pulumi.azurenative.compute.inputs.ImagePurchasePlanArgs;
import io.pulumi.azurenative.compute.inputs.RecommendedMachineConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GalleryImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GalleryImageArgs Empty = new GalleryImageArgs();

    /**
     * The description of this gallery image definition resource. This property is updatable.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Describes the disallowed disk types.
     * 
     */
    @Import(name="disallowed")
      private final @Nullable Output<DisallowedArgs> disallowed;

    public Output<DisallowedArgs> getDisallowed() {
        return this.disallowed == null ? Codegen.empty() : this.disallowed;
    }

    /**
     * The end of life date of the gallery image definition. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    @Import(name="endOfLifeDate")
      private final @Nullable Output<String> endOfLifeDate;

    public Output<String> getEndOfLifeDate() {
        return this.endOfLifeDate == null ? Codegen.empty() : this.endOfLifeDate;
    }

    /**
     * The Eula agreement for the gallery image definition.
     * 
     */
    @Import(name="eula")
      private final @Nullable Output<String> eula;

    public Output<String> getEula() {
        return this.eula == null ? Codegen.empty() : this.eula;
    }

    /**
     * A list of gallery image features.
     * 
     */
    @Import(name="features")
      private final @Nullable Output<List<GalleryImageFeatureArgs>> features;

    public Output<List<GalleryImageFeatureArgs>> getFeatures() {
        return this.features == null ? Codegen.empty() : this.features;
    }

    /**
     * The name of the gallery image definition to be created or updated. The allowed characters are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80 characters.
     * 
     */
    @Import(name="galleryImageName")
      private final @Nullable Output<String> galleryImageName;

    public Output<String> getGalleryImageName() {
        return this.galleryImageName == null ? Codegen.empty() : this.galleryImageName;
    }

    /**
     * The name of the Shared Image Gallery in which the Image Definition is to be created.
     * 
     */
    @Import(name="galleryName", required=true)
      private final Output<String> galleryName;

    public Output<String> getGalleryName() {
        return this.galleryName;
    }

    /**
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     * 
     */
    @Import(name="hyperVGeneration")
      private final @Nullable Output<Either<String,HyperVGeneration>> hyperVGeneration;

    public Output<Either<String,HyperVGeneration>> getHyperVGeneration() {
        return this.hyperVGeneration == null ? Codegen.empty() : this.hyperVGeneration;
    }

    /**
     * This is the gallery image definition identifier.
     * 
     */
    @Import(name="identifier", required=true)
      private final Output<GalleryImageIdentifierArgs> identifier;

    public Output<GalleryImageIdentifierArgs> getIdentifier() {
        return this.identifier;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * This property allows the user to specify whether the virtual machines created under this image are 'Generalized' or 'Specialized'.
     * 
     */
    @Import(name="osState", required=true)
      private final Output<OperatingSystemStateTypes> osState;

    public Output<OperatingSystemStateTypes> getOsState() {
        return this.osState;
    }

    /**
     * This property allows you to specify the type of the OS that is included in the disk when creating a VM from a managed image. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
     */
    @Import(name="osType", required=true)
      private final Output<OperatingSystemTypes> osType;

    public Output<OperatingSystemTypes> getOsType() {
        return this.osType;
    }

    /**
     * The privacy statement uri.
     * 
     */
    @Import(name="privacyStatementUri")
      private final @Nullable Output<String> privacyStatementUri;

    public Output<String> getPrivacyStatementUri() {
        return this.privacyStatementUri == null ? Codegen.empty() : this.privacyStatementUri;
    }

    /**
     * Describes the gallery image definition purchase plan. This is used by marketplace images.
     * 
     */
    @Import(name="purchasePlan")
      private final @Nullable Output<ImagePurchasePlanArgs> purchasePlan;

    public Output<ImagePurchasePlanArgs> getPurchasePlan() {
        return this.purchasePlan == null ? Codegen.empty() : this.purchasePlan;
    }

    /**
     * The properties describe the recommended machine configuration for this Image Definition. These properties are updatable.
     * 
     */
    @Import(name="recommended")
      private final @Nullable Output<RecommendedMachineConfigurationArgs> recommended;

    public Output<RecommendedMachineConfigurationArgs> getRecommended() {
        return this.recommended == null ? Codegen.empty() : this.recommended;
    }

    /**
     * The release note uri.
     * 
     */
    @Import(name="releaseNoteUri")
      private final @Nullable Output<String> releaseNoteUri;

    public Output<String> getReleaseNoteUri() {
        return this.releaseNoteUri == null ? Codegen.empty() : this.releaseNoteUri;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public GalleryImageArgs(
        @Nullable Output<String> description,
        @Nullable Output<DisallowedArgs> disallowed,
        @Nullable Output<String> endOfLifeDate,
        @Nullable Output<String> eula,
        @Nullable Output<List<GalleryImageFeatureArgs>> features,
        @Nullable Output<String> galleryImageName,
        Output<String> galleryName,
        @Nullable Output<Either<String,HyperVGeneration>> hyperVGeneration,
        Output<GalleryImageIdentifierArgs> identifier,
        @Nullable Output<String> location,
        Output<OperatingSystemStateTypes> osState,
        Output<OperatingSystemTypes> osType,
        @Nullable Output<String> privacyStatementUri,
        @Nullable Output<ImagePurchasePlanArgs> purchasePlan,
        @Nullable Output<RecommendedMachineConfigurationArgs> recommended,
        @Nullable Output<String> releaseNoteUri,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.disallowed = disallowed;
        this.endOfLifeDate = endOfLifeDate;
        this.eula = eula;
        this.features = features;
        this.galleryImageName = galleryImageName;
        this.galleryName = Objects.requireNonNull(galleryName, "expected parameter 'galleryName' to be non-null");
        this.hyperVGeneration = hyperVGeneration;
        this.identifier = Objects.requireNonNull(identifier, "expected parameter 'identifier' to be non-null");
        this.location = location;
        this.osState = Objects.requireNonNull(osState, "expected parameter 'osState' to be non-null");
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
        this.privacyStatementUri = privacyStatementUri;
        this.purchasePlan = purchasePlan;
        this.recommended = recommended;
        this.releaseNoteUri = releaseNoteUri;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private GalleryImageArgs() {
        this.description = Codegen.empty();
        this.disallowed = Codegen.empty();
        this.endOfLifeDate = Codegen.empty();
        this.eula = Codegen.empty();
        this.features = Codegen.empty();
        this.galleryImageName = Codegen.empty();
        this.galleryName = Codegen.empty();
        this.hyperVGeneration = Codegen.empty();
        this.identifier = Codegen.empty();
        this.location = Codegen.empty();
        this.osState = Codegen.empty();
        this.osType = Codegen.empty();
        this.privacyStatementUri = Codegen.empty();
        this.purchasePlan = Codegen.empty();
        this.recommended = Codegen.empty();
        this.releaseNoteUri = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<DisallowedArgs> disallowed;
        private @Nullable Output<String> endOfLifeDate;
        private @Nullable Output<String> eula;
        private @Nullable Output<List<GalleryImageFeatureArgs>> features;
        private @Nullable Output<String> galleryImageName;
        private Output<String> galleryName;
        private @Nullable Output<Either<String,HyperVGeneration>> hyperVGeneration;
        private Output<GalleryImageIdentifierArgs> identifier;
        private @Nullable Output<String> location;
        private Output<OperatingSystemStateTypes> osState;
        private Output<OperatingSystemTypes> osType;
        private @Nullable Output<String> privacyStatementUri;
        private @Nullable Output<ImagePurchasePlanArgs> purchasePlan;
        private @Nullable Output<RecommendedMachineConfigurationArgs> recommended;
        private @Nullable Output<String> releaseNoteUri;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disallowed = defaults.disallowed;
    	      this.endOfLifeDate = defaults.endOfLifeDate;
    	      this.eula = defaults.eula;
    	      this.features = defaults.features;
    	      this.galleryImageName = defaults.galleryImageName;
    	      this.galleryName = defaults.galleryName;
    	      this.hyperVGeneration = defaults.hyperVGeneration;
    	      this.identifier = defaults.identifier;
    	      this.location = defaults.location;
    	      this.osState = defaults.osState;
    	      this.osType = defaults.osType;
    	      this.privacyStatementUri = defaults.privacyStatementUri;
    	      this.purchasePlan = defaults.purchasePlan;
    	      this.recommended = defaults.recommended;
    	      this.releaseNoteUri = defaults.releaseNoteUri;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder disallowed(@Nullable Output<DisallowedArgs> disallowed) {
            this.disallowed = disallowed;
            return this;
        }
        public Builder disallowed(@Nullable DisallowedArgs disallowed) {
            this.disallowed = Codegen.ofNullable(disallowed);
            return this;
        }
        public Builder endOfLifeDate(@Nullable Output<String> endOfLifeDate) {
            this.endOfLifeDate = endOfLifeDate;
            return this;
        }
        public Builder endOfLifeDate(@Nullable String endOfLifeDate) {
            this.endOfLifeDate = Codegen.ofNullable(endOfLifeDate);
            return this;
        }
        public Builder eula(@Nullable Output<String> eula) {
            this.eula = eula;
            return this;
        }
        public Builder eula(@Nullable String eula) {
            this.eula = Codegen.ofNullable(eula);
            return this;
        }
        public Builder features(@Nullable Output<List<GalleryImageFeatureArgs>> features) {
            this.features = features;
            return this;
        }
        public Builder features(@Nullable List<GalleryImageFeatureArgs> features) {
            this.features = Codegen.ofNullable(features);
            return this;
        }
        public Builder features(GalleryImageFeatureArgs... features) {
            return features(List.of(features));
        }
        public Builder galleryImageName(@Nullable Output<String> galleryImageName) {
            this.galleryImageName = galleryImageName;
            return this;
        }
        public Builder galleryImageName(@Nullable String galleryImageName) {
            this.galleryImageName = Codegen.ofNullable(galleryImageName);
            return this;
        }
        public Builder galleryName(Output<String> galleryName) {
            this.galleryName = Objects.requireNonNull(galleryName);
            return this;
        }
        public Builder galleryName(String galleryName) {
            this.galleryName = Output.of(Objects.requireNonNull(galleryName));
            return this;
        }
        public Builder hyperVGeneration(@Nullable Output<Either<String,HyperVGeneration>> hyperVGeneration) {
            this.hyperVGeneration = hyperVGeneration;
            return this;
        }
        public Builder hyperVGeneration(@Nullable Either<String,HyperVGeneration> hyperVGeneration) {
            this.hyperVGeneration = Codegen.ofNullable(hyperVGeneration);
            return this;
        }
        public Builder identifier(Output<GalleryImageIdentifierArgs> identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        public Builder identifier(GalleryImageIdentifierArgs identifier) {
            this.identifier = Output.of(Objects.requireNonNull(identifier));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder osState(Output<OperatingSystemStateTypes> osState) {
            this.osState = Objects.requireNonNull(osState);
            return this;
        }
        public Builder osState(OperatingSystemStateTypes osState) {
            this.osState = Output.of(Objects.requireNonNull(osState));
            return this;
        }
        public Builder osType(Output<OperatingSystemTypes> osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public Builder osType(OperatingSystemTypes osType) {
            this.osType = Output.of(Objects.requireNonNull(osType));
            return this;
        }
        public Builder privacyStatementUri(@Nullable Output<String> privacyStatementUri) {
            this.privacyStatementUri = privacyStatementUri;
            return this;
        }
        public Builder privacyStatementUri(@Nullable String privacyStatementUri) {
            this.privacyStatementUri = Codegen.ofNullable(privacyStatementUri);
            return this;
        }
        public Builder purchasePlan(@Nullable Output<ImagePurchasePlanArgs> purchasePlan) {
            this.purchasePlan = purchasePlan;
            return this;
        }
        public Builder purchasePlan(@Nullable ImagePurchasePlanArgs purchasePlan) {
            this.purchasePlan = Codegen.ofNullable(purchasePlan);
            return this;
        }
        public Builder recommended(@Nullable Output<RecommendedMachineConfigurationArgs> recommended) {
            this.recommended = recommended;
            return this;
        }
        public Builder recommended(@Nullable RecommendedMachineConfigurationArgs recommended) {
            this.recommended = Codegen.ofNullable(recommended);
            return this;
        }
        public Builder releaseNoteUri(@Nullable Output<String> releaseNoteUri) {
            this.releaseNoteUri = releaseNoteUri;
            return this;
        }
        public Builder releaseNoteUri(@Nullable String releaseNoteUri) {
            this.releaseNoteUri = Codegen.ofNullable(releaseNoteUri);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public GalleryImageArgs build() {
            return new GalleryImageArgs(description, disallowed, endOfLifeDate, eula, features, galleryImageName, galleryName, hyperVGeneration, identifier, location, osState, osType, privacyStatementUri, purchasePlan, recommended, releaseNoteUri, resourceGroupName, tags);
        }
    }
}
