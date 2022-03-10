// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.websecurityscanner_v1.outputs.AuthenticationResponse;
import io.pulumi.googlenative.websecurityscanner_v1.outputs.ScheduleResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetScanConfigResult {
    /**
     * The authentication configuration. If specified, service will use the authentication configuration during scanning.
     * 
     */
    private final AuthenticationResponse authentication;
    /**
     * The excluded URL patterns as described in https://cloud.google.com/security-command-center/docs/how-to-use-web-security-scanner#excluding_urls
     * 
     */
    private final List<String> blacklistPatterns;
    /**
     * The user provided display name of the ScanConfig.
     * 
     */
    private final String displayName;
    /**
     * Controls export of scan configurations and results to Security Command Center.
     * 
     */
    private final String exportToSecurityCommandCenter;
    /**
     * Whether to keep scanning even if most requests return HTTP error codes.
     * 
     */
    private final Boolean ignoreHttpStatusErrors;
    /**
     * Whether the scan config is managed by Web Security Scanner, output only.
     * 
     */
    private final Boolean managedScan;
    /**
     * The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively. If the field is unspecified or its value is set 0, server will default to 15. Other values outside of [5, 20] range will be rejected with INVALID_ARGUMENT error.
     * 
     */
    private final Integer maxQps;
    /**
     * The resource name of the ScanConfig. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'. The ScanConfig IDs are generated by the system.
     * 
     */
    private final String name;
    /**
     * The risk level selected for the scan
     * 
     */
    private final String riskLevel;
    /**
     * The schedule of the ScanConfig.
     * 
     */
    private final ScheduleResponse schedule;
    /**
     * The starting URLs from which the scanner finds site pages.
     * 
     */
    private final List<String> startingUrls;
    /**
     * Whether the scan configuration has enabled static IP address scan feature. If enabled, the scanner will access applications from static IP addresses.
     * 
     */
    private final Boolean staticIpScan;
    /**
     * The user agent used during scanning.
     * 
     */
    private final String userAgent;

    @OutputCustomType.Constructor
    private GetScanConfigResult(
        @OutputCustomType.Parameter("authentication") AuthenticationResponse authentication,
        @OutputCustomType.Parameter("blacklistPatterns") List<String> blacklistPatterns,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("exportToSecurityCommandCenter") String exportToSecurityCommandCenter,
        @OutputCustomType.Parameter("ignoreHttpStatusErrors") Boolean ignoreHttpStatusErrors,
        @OutputCustomType.Parameter("managedScan") Boolean managedScan,
        @OutputCustomType.Parameter("maxQps") Integer maxQps,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("riskLevel") String riskLevel,
        @OutputCustomType.Parameter("schedule") ScheduleResponse schedule,
        @OutputCustomType.Parameter("startingUrls") List<String> startingUrls,
        @OutputCustomType.Parameter("staticIpScan") Boolean staticIpScan,
        @OutputCustomType.Parameter("userAgent") String userAgent) {
        this.authentication = authentication;
        this.blacklistPatterns = blacklistPatterns;
        this.displayName = displayName;
        this.exportToSecurityCommandCenter = exportToSecurityCommandCenter;
        this.ignoreHttpStatusErrors = ignoreHttpStatusErrors;
        this.managedScan = managedScan;
        this.maxQps = maxQps;
        this.name = name;
        this.riskLevel = riskLevel;
        this.schedule = schedule;
        this.startingUrls = startingUrls;
        this.staticIpScan = staticIpScan;
        this.userAgent = userAgent;
    }

    /**
     * The authentication configuration. If specified, service will use the authentication configuration during scanning.
     * 
    */
    public AuthenticationResponse getAuthentication() {
        return this.authentication;
    }
    /**
     * The excluded URL patterns as described in https://cloud.google.com/security-command-center/docs/how-to-use-web-security-scanner#excluding_urls
     * 
    */
    public List<String> getBlacklistPatterns() {
        return this.blacklistPatterns;
    }
    /**
     * The user provided display name of the ScanConfig.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Controls export of scan configurations and results to Security Command Center.
     * 
    */
    public String getExportToSecurityCommandCenter() {
        return this.exportToSecurityCommandCenter;
    }
    /**
     * Whether to keep scanning even if most requests return HTTP error codes.
     * 
    */
    public Boolean getIgnoreHttpStatusErrors() {
        return this.ignoreHttpStatusErrors;
    }
    /**
     * Whether the scan config is managed by Web Security Scanner, output only.
     * 
    */
    public Boolean getManagedScan() {
        return this.managedScan;
    }
    /**
     * The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively. If the field is unspecified or its value is set 0, server will default to 15. Other values outside of [5, 20] range will be rejected with INVALID_ARGUMENT error.
     * 
    */
    public Integer getMaxQps() {
        return this.maxQps;
    }
    /**
     * The resource name of the ScanConfig. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'. The ScanConfig IDs are generated by the system.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The risk level selected for the scan
     * 
    */
    public String getRiskLevel() {
        return this.riskLevel;
    }
    /**
     * The schedule of the ScanConfig.
     * 
    */
    public ScheduleResponse getSchedule() {
        return this.schedule;
    }
    /**
     * The starting URLs from which the scanner finds site pages.
     * 
    */
    public List<String> getStartingUrls() {
        return this.startingUrls;
    }
    /**
     * Whether the scan configuration has enabled static IP address scan feature. If enabled, the scanner will access applications from static IP addresses.
     * 
    */
    public Boolean getStaticIpScan() {
        return this.staticIpScan;
    }
    /**
     * The user agent used during scanning.
     * 
    */
    public String getUserAgent() {
        return this.userAgent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScanConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationResponse authentication;
        private List<String> blacklistPatterns;
        private String displayName;
        private String exportToSecurityCommandCenter;
        private Boolean ignoreHttpStatusErrors;
        private Boolean managedScan;
        private Integer maxQps;
        private String name;
        private String riskLevel;
        private ScheduleResponse schedule;
        private List<String> startingUrls;
        private Boolean staticIpScan;
        private String userAgent;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScanConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.blacklistPatterns = defaults.blacklistPatterns;
    	      this.displayName = defaults.displayName;
    	      this.exportToSecurityCommandCenter = defaults.exportToSecurityCommandCenter;
    	      this.ignoreHttpStatusErrors = defaults.ignoreHttpStatusErrors;
    	      this.managedScan = defaults.managedScan;
    	      this.maxQps = defaults.maxQps;
    	      this.name = defaults.name;
    	      this.riskLevel = defaults.riskLevel;
    	      this.schedule = defaults.schedule;
    	      this.startingUrls = defaults.startingUrls;
    	      this.staticIpScan = defaults.staticIpScan;
    	      this.userAgent = defaults.userAgent;
        }

        public Builder authentication(AuthenticationResponse authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }

        public Builder blacklistPatterns(List<String> blacklistPatterns) {
            this.blacklistPatterns = Objects.requireNonNull(blacklistPatterns);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder exportToSecurityCommandCenter(String exportToSecurityCommandCenter) {
            this.exportToSecurityCommandCenter = Objects.requireNonNull(exportToSecurityCommandCenter);
            return this;
        }

        public Builder ignoreHttpStatusErrors(Boolean ignoreHttpStatusErrors) {
            this.ignoreHttpStatusErrors = Objects.requireNonNull(ignoreHttpStatusErrors);
            return this;
        }

        public Builder managedScan(Boolean managedScan) {
            this.managedScan = Objects.requireNonNull(managedScan);
            return this;
        }

        public Builder maxQps(Integer maxQps) {
            this.maxQps = Objects.requireNonNull(maxQps);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder riskLevel(String riskLevel) {
            this.riskLevel = Objects.requireNonNull(riskLevel);
            return this;
        }

        public Builder schedule(ScheduleResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder startingUrls(List<String> startingUrls) {
            this.startingUrls = Objects.requireNonNull(startingUrls);
            return this;
        }

        public Builder staticIpScan(Boolean staticIpScan) {
            this.staticIpScan = Objects.requireNonNull(staticIpScan);
            return this;
        }

        public Builder userAgent(String userAgent) {
            this.userAgent = Objects.requireNonNull(userAgent);
            return this;
        }
        public GetScanConfigResult build() {
            return new GetScanConfigResult(authentication, blacklistPatterns, displayName, exportToSecurityCommandCenter, ignoreHttpStatusErrors, managedScan, maxQps, name, riskLevel, schedule, startingUrls, staticIpScan, userAgent);
        }
    }
}
