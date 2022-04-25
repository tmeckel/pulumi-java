// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_v1.outputs.CustomerEncryptionKeyResponse;
import com.pulumi.googlenative.compute_v1.outputs.InstancePropertiesResponse;
import com.pulumi.googlenative.compute_v1.outputs.SavedDiskResponse;
import com.pulumi.googlenative.compute_v1.outputs.SourceDiskEncryptionKeyResponse;
import com.pulumi.googlenative.compute_v1.outputs.SourceInstancePropertiesResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMachineImageResult {
    /**
     * @return The creation timestamp for this machine image in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return [Input Only] Whether to attempt an application consistent machine image by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    private final Boolean guestFlush;
    /**
     * @return Properties of source instance
     * 
     */
    private final InstancePropertiesResponse instanceProperties;
    /**
     * @return The resource type, which is always compute#machineImage for machine image.
     * 
     */
    private final String kind;
    /**
     * @return Encrypts the machine image using a customer-supplied encryption key. After you encrypt a machine image using a customer-supplied key, you must provide the same key if you use the machine image later. For example, you must provide the encryption key when you create an instance from the encrypted machine image in a future request. Customer-supplied encryption keys do not protect access to metadata of the machine image. If you do not provide an encryption key when creating the machine image, then the machine image will be encrypted using an automatically generated key and you do not need to provide a key to use the machine image later.
     * 
     */
    private final CustomerEncryptionKeyResponse machineImageEncryptionKey;
    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return Reserved for future use.
     * 
     */
    private final Boolean satisfiesPzs;
    /**
     * @return An array of Machine Image specific properties for disks attached to the source instance
     * 
     */
    private final List<SavedDiskResponse> savedDisks;
    /**
     * @return The URL for this machine image. The server defines this URL.
     * 
     */
    private final String selfLink;
    /**
     * @return [Input Only] The customer-supplied encryption key of the disks attached to the source instance. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    private final List<SourceDiskEncryptionKeyResponse> sourceDiskEncryptionKeys;
    /**
     * @return The source instance used to create the machine image. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    private final String sourceInstance;
    /**
     * @return DEPRECATED: Please use instance_properties instead for source instance related properties. New properties will not be added to this field.
     * 
     */
    private final SourceInstancePropertiesResponse sourceInstanceProperties;
    /**
     * @return The status of the machine image. One of the following values: INVALID, CREATING, READY, DELETING, and UPLOADING.
     * 
     */
    private final String status;
    /**
     * @return The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
     * 
     */
    private final List<String> storageLocations;
    /**
     * @return Total size of the storage used by the machine image.
     * 
     */
    private final String totalStorageBytes;

    @CustomType.Constructor
    private GetMachineImageResult(
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("guestFlush") Boolean guestFlush,
        @CustomType.Parameter("instanceProperties") InstancePropertiesResponse instanceProperties,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("machineImageEncryptionKey") CustomerEncryptionKeyResponse machineImageEncryptionKey,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("satisfiesPzs") Boolean satisfiesPzs,
        @CustomType.Parameter("savedDisks") List<SavedDiskResponse> savedDisks,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("sourceDiskEncryptionKeys") List<SourceDiskEncryptionKeyResponse> sourceDiskEncryptionKeys,
        @CustomType.Parameter("sourceInstance") String sourceInstance,
        @CustomType.Parameter("sourceInstanceProperties") SourceInstancePropertiesResponse sourceInstanceProperties,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("storageLocations") List<String> storageLocations,
        @CustomType.Parameter("totalStorageBytes") String totalStorageBytes) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.guestFlush = guestFlush;
        this.instanceProperties = instanceProperties;
        this.kind = kind;
        this.machineImageEncryptionKey = machineImageEncryptionKey;
        this.name = name;
        this.satisfiesPzs = satisfiesPzs;
        this.savedDisks = savedDisks;
        this.selfLink = selfLink;
        this.sourceDiskEncryptionKeys = sourceDiskEncryptionKeys;
        this.sourceInstance = sourceInstance;
        this.sourceInstanceProperties = sourceInstanceProperties;
        this.status = status;
        this.storageLocations = storageLocations;
        this.totalStorageBytes = totalStorageBytes;
    }

    /**
     * @return The creation timestamp for this machine image in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return [Input Only] Whether to attempt an application consistent machine image by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    public Boolean guestFlush() {
        return this.guestFlush;
    }
    /**
     * @return Properties of source instance
     * 
     */
    public InstancePropertiesResponse instanceProperties() {
        return this.instanceProperties;
    }
    /**
     * @return The resource type, which is always compute#machineImage for machine image.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Encrypts the machine image using a customer-supplied encryption key. After you encrypt a machine image using a customer-supplied key, you must provide the same key if you use the machine image later. For example, you must provide the encryption key when you create an instance from the encrypted machine image in a future request. Customer-supplied encryption keys do not protect access to metadata of the machine image. If you do not provide an encryption key when creating the machine image, then the machine image will be encrypted using an automatically generated key and you do not need to provide a key to use the machine image later.
     * 
     */
    public CustomerEncryptionKeyResponse machineImageEncryptionKey() {
        return this.machineImageEncryptionKey;
    }
    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Reserved for future use.
     * 
     */
    public Boolean satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * @return An array of Machine Image specific properties for disks attached to the source instance
     * 
     */
    public List<SavedDiskResponse> savedDisks() {
        return this.savedDisks;
    }
    /**
     * @return The URL for this machine image. The server defines this URL.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return [Input Only] The customer-supplied encryption key of the disks attached to the source instance. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    public List<SourceDiskEncryptionKeyResponse> sourceDiskEncryptionKeys() {
        return this.sourceDiskEncryptionKeys;
    }
    /**
     * @return The source instance used to create the machine image. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    public String sourceInstance() {
        return this.sourceInstance;
    }
    /**
     * @return DEPRECATED: Please use instance_properties instead for source instance related properties. New properties will not be added to this field.
     * 
     */
    public SourceInstancePropertiesResponse sourceInstanceProperties() {
        return this.sourceInstanceProperties;
    }
    /**
     * @return The status of the machine image. One of the following values: INVALID, CREATING, READY, DELETING, and UPLOADING.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
     * 
     */
    public List<String> storageLocations() {
        return this.storageLocations;
    }
    /**
     * @return Total size of the storage used by the machine image.
     * 
     */
    public String totalStorageBytes() {
        return this.totalStorageBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMachineImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private Boolean guestFlush;
        private InstancePropertiesResponse instanceProperties;
        private String kind;
        private CustomerEncryptionKeyResponse machineImageEncryptionKey;
        private String name;
        private Boolean satisfiesPzs;
        private List<SavedDiskResponse> savedDisks;
        private String selfLink;
        private List<SourceDiskEncryptionKeyResponse> sourceDiskEncryptionKeys;
        private String sourceInstance;
        private SourceInstancePropertiesResponse sourceInstanceProperties;
        private String status;
        private List<String> storageLocations;
        private String totalStorageBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMachineImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.guestFlush = defaults.guestFlush;
    	      this.instanceProperties = defaults.instanceProperties;
    	      this.kind = defaults.kind;
    	      this.machineImageEncryptionKey = defaults.machineImageEncryptionKey;
    	      this.name = defaults.name;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.savedDisks = defaults.savedDisks;
    	      this.selfLink = defaults.selfLink;
    	      this.sourceDiskEncryptionKeys = defaults.sourceDiskEncryptionKeys;
    	      this.sourceInstance = defaults.sourceInstance;
    	      this.sourceInstanceProperties = defaults.sourceInstanceProperties;
    	      this.status = defaults.status;
    	      this.storageLocations = defaults.storageLocations;
    	      this.totalStorageBytes = defaults.totalStorageBytes;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder guestFlush(Boolean guestFlush) {
            this.guestFlush = Objects.requireNonNull(guestFlush);
            return this;
        }
        public Builder instanceProperties(InstancePropertiesResponse instanceProperties) {
            this.instanceProperties = Objects.requireNonNull(instanceProperties);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder machineImageEncryptionKey(CustomerEncryptionKeyResponse machineImageEncryptionKey) {
            this.machineImageEncryptionKey = Objects.requireNonNull(machineImageEncryptionKey);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder satisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }
        public Builder savedDisks(List<SavedDiskResponse> savedDisks) {
            this.savedDisks = Objects.requireNonNull(savedDisks);
            return this;
        }
        public Builder savedDisks(SavedDiskResponse... savedDisks) {
            return savedDisks(List.of(savedDisks));
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder sourceDiskEncryptionKeys(List<SourceDiskEncryptionKeyResponse> sourceDiskEncryptionKeys) {
            this.sourceDiskEncryptionKeys = Objects.requireNonNull(sourceDiskEncryptionKeys);
            return this;
        }
        public Builder sourceDiskEncryptionKeys(SourceDiskEncryptionKeyResponse... sourceDiskEncryptionKeys) {
            return sourceDiskEncryptionKeys(List.of(sourceDiskEncryptionKeys));
        }
        public Builder sourceInstance(String sourceInstance) {
            this.sourceInstance = Objects.requireNonNull(sourceInstance);
            return this;
        }
        public Builder sourceInstanceProperties(SourceInstancePropertiesResponse sourceInstanceProperties) {
            this.sourceInstanceProperties = Objects.requireNonNull(sourceInstanceProperties);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder storageLocations(List<String> storageLocations) {
            this.storageLocations = Objects.requireNonNull(storageLocations);
            return this;
        }
        public Builder storageLocations(String... storageLocations) {
            return storageLocations(List.of(storageLocations));
        }
        public Builder totalStorageBytes(String totalStorageBytes) {
            this.totalStorageBytes = Objects.requireNonNull(totalStorageBytes);
            return this;
        }        public GetMachineImageResult build() {
            return new GetMachineImageResult(creationTimestamp, description, guestFlush, instanceProperties, kind, machineImageEncryptionKey, name, satisfiesPzs, savedDisks, selfLink, sourceDiskEncryptionKeys, sourceInstance, sourceInstanceProperties, status, storageLocations, totalStorageBytes);
        }
    }
}
