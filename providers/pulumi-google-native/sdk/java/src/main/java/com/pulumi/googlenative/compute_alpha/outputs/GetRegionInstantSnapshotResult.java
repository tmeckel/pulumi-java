// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.InstantSnapshotResourceStatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRegionInstantSnapshotResult {
    /**
     * @return The architecture of the instant snapshot. Valid values are ARM64 or X86_64.
     * 
     */
    private final String architecture;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return Size of the source disk, specified in GB.
     * 
     */
    private final String diskSizeGb;
    /**
     * @return Whether to attempt an application consistent instant snapshot by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    private final Boolean guestFlush;
    /**
     * @return Type of the resource. Always compute#instantSnapshot for InstantSnapshot resources.
     * 
     */
    private final String kind;
    /**
     * @return A fingerprint for the labels being applied to this InstantSnapshot, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a InstantSnapshot.
     * 
     */
    private final String labelFingerprint;
    /**
     * @return Labels to apply to this InstantSnapshot. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return URL of the region where the instant snapshot resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * @return Status information for the instant snapshot resource.
     * 
     */
    private final InstantSnapshotResourceStatusResponse resourceStatus;
    /**
     * @return Reserved for future use.
     * 
     */
    private final Boolean satisfiesPzs;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return Server-defined URL for this resource&#39;s resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * @return URL of the source disk used to create this instant snapshot. Note that the source disk must be in the same zone/region as the instant snapshot to be created. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - https://www.googleapis.com/compute/v1/projects/project/regions/region /disks/disk - projects/project/zones/zone/disks/disk - projects/project/regions/region/disks/disk - zones/zone/disks/disk - regions/region/disks/disk
     * 
     */
    private final String sourceDisk;
    /**
     * @return The ID value of the disk used to create this InstantSnapshot. This value may be used to determine whether the InstantSnapshot was taken from the current or a previous instance of a given disk name.
     * 
     */
    private final String sourceDiskId;
    /**
     * @return The status of the instantSnapshot. This can be CREATING, DELETING, FAILED, or READY.
     * 
     */
    private final String status;
    /**
     * @return URL of the zone where the instant snapshot resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private GetRegionInstantSnapshotResult(
        @CustomType.Parameter("architecture") String architecture,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("diskSizeGb") String diskSizeGb,
        @CustomType.Parameter("guestFlush") Boolean guestFlush,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("labelFingerprint") String labelFingerprint,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("resourceStatus") InstantSnapshotResourceStatusResponse resourceStatus,
        @CustomType.Parameter("satisfiesPzs") Boolean satisfiesPzs,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("selfLinkWithId") String selfLinkWithId,
        @CustomType.Parameter("sourceDisk") String sourceDisk,
        @CustomType.Parameter("sourceDiskId") String sourceDiskId,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("zone") String zone) {
        this.architecture = architecture;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.diskSizeGb = diskSizeGb;
        this.guestFlush = guestFlush;
        this.kind = kind;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.name = name;
        this.region = region;
        this.resourceStatus = resourceStatus;
        this.satisfiesPzs = satisfiesPzs;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
        this.sourceDisk = sourceDisk;
        this.sourceDiskId = sourceDiskId;
        this.status = status;
        this.zone = zone;
    }

    /**
     * @return The architecture of the instant snapshot. Valid values are ARM64 or X86_64.
     * 
     */
    public String architecture() {
        return this.architecture;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
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
     * @return Size of the source disk, specified in GB.
     * 
     */
    public String diskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * @return Whether to attempt an application consistent instant snapshot by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    public Boolean guestFlush() {
        return this.guestFlush;
    }
    /**
     * @return Type of the resource. Always compute#instantSnapshot for InstantSnapshot resources.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return A fingerprint for the labels being applied to this InstantSnapshot, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a InstantSnapshot.
     * 
     */
    public String labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * @return Labels to apply to this InstantSnapshot. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return URL of the region where the instant snapshot resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Status information for the instant snapshot resource.
     * 
     */
    public InstantSnapshotResourceStatusResponse resourceStatus() {
        return this.resourceStatus;
    }
    /**
     * @return Reserved for future use.
     * 
     */
    public Boolean satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Server-defined URL for this resource&#39;s resource id.
     * 
     */
    public String selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * @return URL of the source disk used to create this instant snapshot. Note that the source disk must be in the same zone/region as the instant snapshot to be created. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - https://www.googleapis.com/compute/v1/projects/project/regions/region /disks/disk - projects/project/zones/zone/disks/disk - projects/project/regions/region/disks/disk - zones/zone/disks/disk - regions/region/disks/disk
     * 
     */
    public String sourceDisk() {
        return this.sourceDisk;
    }
    /**
     * @return The ID value of the disk used to create this InstantSnapshot. This value may be used to determine whether the InstantSnapshot was taken from the current or a previous instance of a given disk name.
     * 
     */
    public String sourceDiskId() {
        return this.sourceDiskId;
    }
    /**
     * @return The status of the instantSnapshot. This can be CREATING, DELETING, FAILED, or READY.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return URL of the zone where the instant snapshot resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstantSnapshotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String architecture;
        private String creationTimestamp;
        private String description;
        private String diskSizeGb;
        private Boolean guestFlush;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String name;
        private String region;
        private InstantSnapshotResourceStatusResponse resourceStatus;
        private Boolean satisfiesPzs;
        private String selfLink;
        private String selfLinkWithId;
        private String sourceDisk;
        private String sourceDiskId;
        private String status;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionInstantSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.guestFlush = defaults.guestFlush;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.resourceStatus = defaults.resourceStatus;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceDiskId = defaults.sourceDiskId;
    	      this.status = defaults.status;
    	      this.zone = defaults.zone;
        }

        public Builder architecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder guestFlush(Boolean guestFlush) {
            this.guestFlush = Objects.requireNonNull(guestFlush);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder labelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder resourceStatus(InstantSnapshotResourceStatusResponse resourceStatus) {
            this.resourceStatus = Objects.requireNonNull(resourceStatus);
            return this;
        }
        public Builder satisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder selfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }
        public Builder sourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }
        public Builder sourceDiskId(String sourceDiskId) {
            this.sourceDiskId = Objects.requireNonNull(sourceDiskId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetRegionInstantSnapshotResult build() {
            return new GetRegionInstantSnapshotResult(architecture, creationTimestamp, description, diskSizeGb, guestFlush, kind, labelFingerprint, labels, name, region, resourceStatus, satisfiesPzs, selfLink, selfLinkWithId, sourceDisk, sourceDiskId, status, zone);
        }
    }
}
