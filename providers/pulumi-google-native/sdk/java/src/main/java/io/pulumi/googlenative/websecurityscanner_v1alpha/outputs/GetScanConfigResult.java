// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.websecurityscanner_v1alpha.outputs.AuthenticationResponse;
import io.pulumi.googlenative.websecurityscanner_v1alpha.outputs.ScanRunResponse;
import io.pulumi.googlenative.websecurityscanner_v1alpha.outputs.ScheduleResponse;
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
     * Latest ScanRun if available.
     * 
     */
    private final ScanRunResponse latestRun;
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
     * Set of Google Cloud platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
     * 
     */
    private final List<String> targetPlatforms;
    /**
     * The user agent used during scanning.
     * 
     */
    private final String userAgent;

    @OutputCustomType.Constructor({"authentication","blacklistPatterns","displayName","latestRun","maxQps","name","schedule","startingUrls","targetPlatforms","userAgent"})
    private GetScanConfigResult(
        AuthenticationResponse authentication,
        List<String> blacklistPatterns,
        String displayName,
        ScanRunResponse latestRun,
        Integer maxQps,
        String name,
        ScheduleResponse schedule,
        List<String> startingUrls,
        List<String> targetPlatforms,
        String userAgent) {
        this.authentication = Objects.requireNonNull(authentication);
        this.blacklistPatterns = Objects.requireNonNull(blacklistPatterns);
        this.displayName = Objects.requireNonNull(displayName);
        this.latestRun = Objects.requireNonNull(latestRun);
        this.maxQps = Objects.requireNonNull(maxQps);
        this.name = Objects.requireNonNull(name);
        this.schedule = Objects.requireNonNull(schedule);
        this.startingUrls = Objects.requireNonNull(startingUrls);
        this.targetPlatforms = Objects.requireNonNull(targetPlatforms);
        this.userAgent = Objects.requireNonNull(userAgent);
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
     * Latest ScanRun if available.
     * 
     */
    public ScanRunResponse getLatestRun() {
        return this.latestRun;
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
     * Set of Google Cloud platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
     * 
     */
    public List<String> getTargetPlatforms() {
        return this.targetPlatforms;
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
        private ScanRunResponse latestRun;
        private Integer maxQps;
        private String name;
        private ScheduleResponse schedule;
        private List<String> startingUrls;
        private List<String> targetPlatforms;
        private String userAgent;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScanConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.blacklistPatterns = defaults.blacklistPatterns;
    	      this.displayName = defaults.displayName;
    	      this.latestRun = defaults.latestRun;
    	      this.maxQps = defaults.maxQps;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.startingUrls = defaults.startingUrls;
    	      this.targetPlatforms = defaults.targetPlatforms;
    	      this.userAgent = defaults.userAgent;
        }

        public Builder setAuthentication(AuthenticationResponse authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }

        public Builder setBlacklistPatterns(List<String> blacklistPatterns) {
            this.blacklistPatterns = Objects.requireNonNull(blacklistPatterns);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setLatestRun(ScanRunResponse latestRun) {
            this.latestRun = Objects.requireNonNull(latestRun);
            return this;
        }

        public Builder setMaxQps(Integer maxQps) {
            this.maxQps = Objects.requireNonNull(maxQps);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSchedule(ScheduleResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setStartingUrls(List<String> startingUrls) {
            this.startingUrls = Objects.requireNonNull(startingUrls);
            return this;
        }

        public Builder setTargetPlatforms(List<String> targetPlatforms) {
            this.targetPlatforms = Objects.requireNonNull(targetPlatforms);
            return this;
        }

        public Builder setUserAgent(String userAgent) {
            this.userAgent = Objects.requireNonNull(userAgent);
            return this;
        }

        public GetScanConfigResult build() {
            return new GetScanConfigResult(authentication, blacklistPatterns, displayName, latestRun, maxQps, name, schedule, startingUrls, targetPlatforms, userAgent);
        }
    }
}
