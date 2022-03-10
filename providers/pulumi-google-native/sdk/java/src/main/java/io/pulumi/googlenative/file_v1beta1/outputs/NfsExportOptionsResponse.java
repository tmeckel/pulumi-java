// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class NfsExportOptionsResponse {
    /**
     * Either READ_ONLY, for allowing only read requests on the exported directory, or READ_WRITE, for allowing both read and write requests. The default is READ_WRITE.
     * 
     */
    private final String accessMode;
    /**
     * An integer representing the anonymous group id with a default value of 65534. Anon_gid may only be set with squash_mode of ROOT_SQUASH. An error will be returned if this field is specified for other squash_mode settings.
     * 
     */
    private final String anonGid;
    /**
     * An integer representing the anonymous user id with a default value of 65534. Anon_uid may only be set with squash_mode of ROOT_SQUASH. An error will be returned if this field is specified for other squash_mode settings.
     * 
     */
    private final String anonUid;
    /**
     * List of either an IPv4 addresses in the format `{octet1}.{octet2}.{octet3}.{octet4}` or CIDR ranges in the format `{octet1}.{octet2}.{octet3}.{octet4}/{mask size}` which may mount the file share. Overlapping IP ranges are not allowed, both within and across NfsExportOptions. An error will be returned. The limit is 64 IP ranges/addresses for each FileShareConfig among all NfsExportOptions.
     * 
     */
    private final List<String> ipRanges;
    /**
     * Either NO_ROOT_SQUASH, for allowing root access on the exported directory, or ROOT_SQUASH, for not allowing root access. The default is NO_ROOT_SQUASH.
     * 
     */
    private final String squashMode;

    @OutputCustomType.Constructor
    private NfsExportOptionsResponse(
        @OutputCustomType.Parameter("accessMode") String accessMode,
        @OutputCustomType.Parameter("anonGid") String anonGid,
        @OutputCustomType.Parameter("anonUid") String anonUid,
        @OutputCustomType.Parameter("ipRanges") List<String> ipRanges,
        @OutputCustomType.Parameter("squashMode") String squashMode) {
        this.accessMode = accessMode;
        this.anonGid = anonGid;
        this.anonUid = anonUid;
        this.ipRanges = ipRanges;
        this.squashMode = squashMode;
    }

    /**
     * Either READ_ONLY, for allowing only read requests on the exported directory, or READ_WRITE, for allowing both read and write requests. The default is READ_WRITE.
     * 
    */
    public String getAccessMode() {
        return this.accessMode;
    }
    /**
     * An integer representing the anonymous group id with a default value of 65534. Anon_gid may only be set with squash_mode of ROOT_SQUASH. An error will be returned if this field is specified for other squash_mode settings.
     * 
    */
    public String getAnonGid() {
        return this.anonGid;
    }
    /**
     * An integer representing the anonymous user id with a default value of 65534. Anon_uid may only be set with squash_mode of ROOT_SQUASH. An error will be returned if this field is specified for other squash_mode settings.
     * 
    */
    public String getAnonUid() {
        return this.anonUid;
    }
    /**
     * List of either an IPv4 addresses in the format `{octet1}.{octet2}.{octet3}.{octet4}` or CIDR ranges in the format `{octet1}.{octet2}.{octet3}.{octet4}/{mask size}` which may mount the file share. Overlapping IP ranges are not allowed, both within and across NfsExportOptions. An error will be returned. The limit is 64 IP ranges/addresses for each FileShareConfig among all NfsExportOptions.
     * 
    */
    public List<String> getIpRanges() {
        return this.ipRanges;
    }
    /**
     * Either NO_ROOT_SQUASH, for allowing root access on the exported directory, or ROOT_SQUASH, for not allowing root access. The default is NO_ROOT_SQUASH.
     * 
    */
    public String getSquashMode() {
        return this.squashMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsExportOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessMode;
        private String anonGid;
        private String anonUid;
        private List<String> ipRanges;
        private String squashMode;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsExportOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessMode = defaults.accessMode;
    	      this.anonGid = defaults.anonGid;
    	      this.anonUid = defaults.anonUid;
    	      this.ipRanges = defaults.ipRanges;
    	      this.squashMode = defaults.squashMode;
        }

        public Builder accessMode(String accessMode) {
            this.accessMode = Objects.requireNonNull(accessMode);
            return this;
        }

        public Builder anonGid(String anonGid) {
            this.anonGid = Objects.requireNonNull(anonGid);
            return this;
        }

        public Builder anonUid(String anonUid) {
            this.anonUid = Objects.requireNonNull(anonUid);
            return this;
        }

        public Builder ipRanges(List<String> ipRanges) {
            this.ipRanges = Objects.requireNonNull(ipRanges);
            return this;
        }

        public Builder squashMode(String squashMode) {
            this.squashMode = Objects.requireNonNull(squashMode);
            return this;
        }
        public NfsExportOptionsResponse build() {
            return new NfsExportOptionsResponse(accessMode, anonGid, anonUid, ipRanges, squashMode);
        }
    }
}
