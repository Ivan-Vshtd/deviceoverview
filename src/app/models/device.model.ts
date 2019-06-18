import {StateLog} from "./state-log.model";

export class Device {
  id;
  ip: string;
  name: string;
  notified: boolean;
  lastOnLineTime: string;
  eventType: string;
  stateLog: StateLog;
  lastChecks: StateLog;
}
