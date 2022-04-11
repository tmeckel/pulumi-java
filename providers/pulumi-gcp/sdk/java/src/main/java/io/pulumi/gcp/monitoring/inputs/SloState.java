// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.monitoring.inputs.SloBasicSliGetArgs;
import io.pulumi.gcp.monitoring.inputs.SloRequestBasedSliGetArgs;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGetArgs;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloState extends io.pulumi.resources.ResourceArgs {

    public static final SloState Empty = new SloState();

    /**
     * Basic Service-Level Indicator (SLI) on a well-known service type.
     * Performance will be computed on the basis of pre-defined metrics.
     * SLIs are used to measure and calculate the quality of the Service's
     * performance with respect to a single aspect of service quality.
     * Exactly one of the following must be set:
     * `basic_sli`, `request_based_sli`, `windows_based_sli`
     * Structure is documented below.
     * 
     */
    @Import(name="basicSli")
      private final @Nullable Output<SloBasicSliGetArgs> basicSli;

    public Output<SloBasicSliGetArgs> getBasicSli() {
        return this.basicSli == null ? Codegen.empty() : this.basicSli;
    }

    /**
     * A calendar period, semantically "since the start of the current
     * <calendarPeriod>".
     * Possible values are `DAY`, `WEEK`, `FORTNIGHT`, and `MONTH`.
     * 
     */
    @Import(name="calendarPeriod")
      private final @Nullable Output<String> calendarPeriod;

    public Output<String> getCalendarPeriod() {
        return this.calendarPeriod == null ? Codegen.empty() : this.calendarPeriod;
    }

    /**
     * Name used for UI elements listing this SLO.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The fraction of service that must be good in order for this objective
     * to be met. 0 < goal <= 0.999
     * 
     */
    @Import(name="goal")
      private final @Nullable Output<Double> goal;

    public Output<Double> getGoal() {
        return this.goal == null ? Codegen.empty() : this.goal;
    }

    /**
     * The full resource name for this service. The syntax is:
     * projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * A request-based SLI defines a SLI for which atomic units of
     * service are counted directly.
     * A SLI describes a good service.
     * It is used to measure and calculate the quality of the Service's
     * performance with respect to a single aspect of service quality.
     * Exactly one of the following must be set:
     * `basic_sli`, `request_based_sli`, `windows_based_sli`
     * Structure is documented below.
     * 
     */
    @Import(name="requestBasedSli")
      private final @Nullable Output<SloRequestBasedSliGetArgs> requestBasedSli;

    public Output<SloRequestBasedSliGetArgs> getRequestBasedSli() {
        return this.requestBasedSli == null ? Codegen.empty() : this.requestBasedSli;
    }

    /**
     * A rolling time period, semantically "in the past X days".
     * Must be between 1 to 30 days, inclusive.
     * 
     */
    @Import(name="rollingPeriodDays")
      private final @Nullable Output<Integer> rollingPeriodDays;

    public Output<Integer> getRollingPeriodDays() {
        return this.rollingPeriodDays == null ? Codegen.empty() : this.rollingPeriodDays;
    }

    /**
     * ID of the service to which this SLO belongs.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    /**
     * The id to use for this ServiceLevelObjective. If omitted, an id will be generated instead.
     * 
     */
    @Import(name="sloId")
      private final @Nullable Output<String> sloId;

    public Output<String> getSloId() {
        return this.sloId == null ? Codegen.empty() : this.sloId;
    }

    /**
     * A windows-based SLI defines the criteria for time windows.
     * good_service is defined based off the count of these time windows
     * for which the provided service was of good quality.
     * A SLI describes a good service. It is used to measure and calculate
     * the quality of the Service's performance with respect to a single
     * aspect of service quality.
     * Exactly one of the following must be set:
     * `basic_sli`, `request_based_sli`, `windows_based_sli`
     * Structure is documented below.
     * 
     */
    @Import(name="windowsBasedSli")
      private final @Nullable Output<SloWindowsBasedSliGetArgs> windowsBasedSli;

    public Output<SloWindowsBasedSliGetArgs> getWindowsBasedSli() {
        return this.windowsBasedSli == null ? Codegen.empty() : this.windowsBasedSli;
    }

    public SloState(
        @Nullable Output<SloBasicSliGetArgs> basicSli,
        @Nullable Output<String> calendarPeriod,
        @Nullable Output<String> displayName,
        @Nullable Output<Double> goal,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<SloRequestBasedSliGetArgs> requestBasedSli,
        @Nullable Output<Integer> rollingPeriodDays,
        @Nullable Output<String> service,
        @Nullable Output<String> sloId,
        @Nullable Output<SloWindowsBasedSliGetArgs> windowsBasedSli) {
        this.basicSli = basicSli;
        this.calendarPeriod = calendarPeriod;
        this.displayName = displayName;
        this.goal = goal;
        this.name = name;
        this.project = project;
        this.requestBasedSli = requestBasedSli;
        this.rollingPeriodDays = rollingPeriodDays;
        this.service = service;
        this.sloId = sloId;
        this.windowsBasedSli = windowsBasedSli;
    }

    private SloState() {
        this.basicSli = Codegen.empty();
        this.calendarPeriod = Codegen.empty();
        this.displayName = Codegen.empty();
        this.goal = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.requestBasedSli = Codegen.empty();
        this.rollingPeriodDays = Codegen.empty();
        this.service = Codegen.empty();
        this.sloId = Codegen.empty();
        this.windowsBasedSli = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SloBasicSliGetArgs> basicSli;
        private @Nullable Output<String> calendarPeriod;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Double> goal;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<SloRequestBasedSliGetArgs> requestBasedSli;
        private @Nullable Output<Integer> rollingPeriodDays;
        private @Nullable Output<String> service;
        private @Nullable Output<String> sloId;
        private @Nullable Output<SloWindowsBasedSliGetArgs> windowsBasedSli;

        public Builder() {
    	      // Empty
        }

        public Builder(SloState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicSli = defaults.basicSli;
    	      this.calendarPeriod = defaults.calendarPeriod;
    	      this.displayName = defaults.displayName;
    	      this.goal = defaults.goal;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestBasedSli = defaults.requestBasedSli;
    	      this.rollingPeriodDays = defaults.rollingPeriodDays;
    	      this.service = defaults.service;
    	      this.sloId = defaults.sloId;
    	      this.windowsBasedSli = defaults.windowsBasedSli;
        }

        public Builder basicSli(@Nullable Output<SloBasicSliGetArgs> basicSli) {
            this.basicSli = basicSli;
            return this;
        }
        public Builder basicSli(@Nullable SloBasicSliGetArgs basicSli) {
            this.basicSli = Codegen.ofNullable(basicSli);
            return this;
        }
        public Builder calendarPeriod(@Nullable Output<String> calendarPeriod) {
            this.calendarPeriod = calendarPeriod;
            return this;
        }
        public Builder calendarPeriod(@Nullable String calendarPeriod) {
            this.calendarPeriod = Codegen.ofNullable(calendarPeriod);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder goal(@Nullable Output<Double> goal) {
            this.goal = goal;
            return this;
        }
        public Builder goal(@Nullable Double goal) {
            this.goal = Codegen.ofNullable(goal);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
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
        public Builder requestBasedSli(@Nullable Output<SloRequestBasedSliGetArgs> requestBasedSli) {
            this.requestBasedSli = requestBasedSli;
            return this;
        }
        public Builder requestBasedSli(@Nullable SloRequestBasedSliGetArgs requestBasedSli) {
            this.requestBasedSli = Codegen.ofNullable(requestBasedSli);
            return this;
        }
        public Builder rollingPeriodDays(@Nullable Output<Integer> rollingPeriodDays) {
            this.rollingPeriodDays = rollingPeriodDays;
            return this;
        }
        public Builder rollingPeriodDays(@Nullable Integer rollingPeriodDays) {
            this.rollingPeriodDays = Codegen.ofNullable(rollingPeriodDays);
            return this;
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }
        public Builder sloId(@Nullable Output<String> sloId) {
            this.sloId = sloId;
            return this;
        }
        public Builder sloId(@Nullable String sloId) {
            this.sloId = Codegen.ofNullable(sloId);
            return this;
        }
        public Builder windowsBasedSli(@Nullable Output<SloWindowsBasedSliGetArgs> windowsBasedSli) {
            this.windowsBasedSli = windowsBasedSli;
            return this;
        }
        public Builder windowsBasedSli(@Nullable SloWindowsBasedSliGetArgs windowsBasedSli) {
            this.windowsBasedSli = Codegen.ofNullable(windowsBasedSli);
            return this;
        }        public SloState build() {
            return new SloState(basicSli, calendarPeriod, displayName, goal, name, project, requestBasedSli, rollingPeriodDays, service, sloId, windowsBasedSli);
        }
    }
}
